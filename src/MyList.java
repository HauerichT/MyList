import java.util.Arrays;

public class MyList {
    int[] array;

    public MyList(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Leeres Array übergeben.");
            System.exit(0);
        }
        this.array = array;
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

        System.out.println("Neues Element zu Array hinzugefügt:");
        System.out.println(Arrays.toString(arrayNew));
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

        System.out.println("Element aus Array entfernt:");
        System.out.println(Arrays.toString(arrayNew));
    }

    // Methode löscht doppelte Elemente
    public int removeDuplicates() {


        // Variable zur Speicherung der aktuellen Array-Länge

        // Variable zur Speicherung der Anzahl von gelöschten Elementen
        int deleteCounter = 0;

        // prüft, ob Elemente doppelt vorkommen und löscht diese
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    deleteCounter++;
                    removeFromList(j);
                    removeDuplicates();
                }
            }
        }

        return deleteCounter;

    }

    public void sortList() {

        // Minimum bestimmen
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];

            for (int j = i; j < array.length; j++) {
                if (smallest > array[j]) {
                    smallest = array[j];
                    indexOfSmallest = j;

                    int temp = array[i];
                    array[i] = array[indexOfSmallest];
                    array[indexOfSmallest] = temp;
                }

            }

        }


        System.out.println(Arrays.toString(array));
        System.out.println(indexOfSmallest);


    }
}
