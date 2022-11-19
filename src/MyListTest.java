public class MyListTest {
    public static void main(String[] args) {

        int[] arrayTest = {2,8,5,6,9,1,1,1};

        MyList myList = new MyList(arrayTest);

        myList.addToList(3, 1);

        myList.removeFromList(0);
        int deletedItems = myList.removeDuplicates();
        System.out.println("Entfernte Elemente: " + deletedItems);

        myList.sortList();
    }
}