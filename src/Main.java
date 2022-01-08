import Alghoritms.search.Search;
import Alghoritms.sorting.Sorting;
import CollectionsADT.ArrayList;
import CollectionsADT.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();



        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertFirst(88);
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.insertFirst(55);
        linkedList.insertFirst(40);

         linkedList.swapElement(2,4);

        for (int x:linkedList) {
//            System.out.println(x);
        }



        Sorting sorting = new Sorting();
        Search search = new Search();

        int [] array = {12,1,10,50,5,15,45,0,88,-96};
        int [] ordered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};

        System.out.print( search.BinarySearchRecursion(ordered, 17, 0, ordered.length-1));


    }
}


