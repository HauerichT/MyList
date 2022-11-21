public class MyList {

    // Instanzvariable
    int[] array;

    // Konstruktor
    public MyList(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Leeres Array übergeben.");
            System.exit(0);
        }
        this.array = array;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Methode fügt item an Stelle index hinzu
    public void addToList(int index, int item) {

        // prüft, ob index innerhalb des Arrays ist
        if (index < 0 || index >= array.length) {
            System.out.println("Index ist außerhalb des gegebenen Arrays.");
            System.exit(0);
        }

        // erzeugt neues, um 1 vergrößertes, Array
        int[] arrayNew = new int[array.length+1];

        // setzt das neue Element an der richtigen Position
        arrayNew[index] = item;

        // fügt alle Elemente vor der neuen Zahl hinzu
        for (int i = 0; i < index; i++) {
            arrayNew[i] = array[i];
        }

        // fügt alle Elemente nach der neuen Zahl hinzu
        for (int i = index; i < array.length; i++) {
            arrayNew[i+1] = array[i];
        }

        // weist der Variable array das neue Array zu
        this.array = arrayNew;

        printArray();
    }

    // Methode löscht Element an der Stelle index
    public void removeFromList(int index) {

        // prüft, ob index innerhalb des Arrays ist
        if (index < 0 || index >= array.length) {
            System.out.println("Index ist außerhalb des gegebenen Arrays.");
            System.exit(0);
        }

        // erzeugt neues Array mit der Länge von array verkleinert um 1
        int[] arrayNew = new int[array.length-1];

        // fügt alle Elemente vor der zu löschenden Zahl hinzu
        for (int i = 0; i < index; i++) {
            arrayNew[i] = array[i];
        }

        // fügt alle Elemente nach der zu löschenden Zahl hinzu
        for (int i = index; i < arrayNew.length; i++) {
            arrayNew[i] = array[i+1];
        }

        // weist der Variable array das neue Array zu
        this.array = arrayNew;

        printArray();
    }

    // Methode löscht doppelte Elemente
    public int removeDuplicates() {

        // Variable zur Speicherung der Anzahl von gelöschten Elementen
        int arrayLengthBefore = array.length;

        // prüft, ob Elemente doppelt vorkommen und löscht diese
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    removeFromList(j);
                    removeDuplicates();
                }
            }
        }
        // gibt die Anzahl der entfernten Elemente zurück
        return arrayLengthBefore - array.length;

    }

    // Methode sortiert Array von kleinstem Wert zu größtem Wert
    public void sortList() {

        // Variable zur Speicherung des kleinsten Wertes deklarieren
        int indexOfSmallest;

        for (int i = 0; i < array.length; i++) {
            // erster Wert ist zunächst kleinster Wert
            int smallest = array[i];

            // prüft, welcher der kleinste Wert ist und tauscht diesen mit dem i-ten Wert
            for (int j = i; j < array.length; j++) {
                if (smallest > array[j]) {
                    smallest = array[j];
                    indexOfSmallest = j;

                    // bringt kleinsten Wert an i-te Stelle
                    int temp = array[i];
                    array[i] = array[indexOfSmallest];
                    array[indexOfSmallest] = temp;
                }

            }

        }
        printArray();

    }

    // Methode prüft alle Kombinationen von drei Zahlen im Array, deren Summe gleich die übergebene Zahl ist
    public void kombiZahl (int zahl) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    // prüft, ob die Summe der Kombination gleich die übergebene Zahl ist
                    if (array[i] + array[j] + array[k] == zahl) {
                        System.out.println("Kombination: " + array[i] + " + " + array[j] + " + " + array[k] + " = " + zahl);
                    }
                }
            }
        }
    }

}
