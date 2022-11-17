public class MyListTest {
    public static void main(String[] args) {

        int[] arrayTest = {8,5,6,9,2};

        MyList myList = new MyList(arrayTest);
        myList.addToList(0, 2);
        myList.addToList(4, 6);

        myList.removeFromList(3);
        int deletedItems = myList.removeDuplicates();
        System.out.println("Entfernte Elemente: " + deletedItems);

        myList.sortList();
    }
}