public class MyListTest {
    public static void main(String[] args) {

        // Testarray
        int[] arrayTest = {2,8,3,5,6,9,1,1};

        // Startzustand des Arrays ausgeben
        System.out.println("arrayTest:");
        MyList myList = new MyList(arrayTest);
        myList.printArray();

        // Spacer
        System.out.println();

        // Test: Element zu Array hinzufügen
        System.out.println("addToList Test:");
        myList.addToList(3, 2);

        // Spacer
        System.out.println();

        // Test: Element aus Array entfernen
        System.out.println("removeFromList Test:");
        myList.removeFromList(1);

        // Spacer
        System.out.println();

        // Test: Duplikate entfernen
        System.out.println("removeDuplicates Test:");
        int deletedItems = myList.removeDuplicates();
        System.out.println("Entfernte Elemente: " + deletedItems);

        System.out.println();

        // Test: Array sortieren
        System.out.println("sortList Test:");
        myList.sortList();

        System.out.println();

        // Test: KombiZahlen ermitteln
        System.out.println("kombiZahl Test:");
        myList.kombiZahl(9);
    }
}