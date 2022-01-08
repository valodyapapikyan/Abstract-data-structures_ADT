import Alghoritms.search.Search;
import Alghoritms.sorting.Sorting;
import CollectionsADT.ArrayList;
import CollectionsADT.ArrayQueue;
import CollectionsADT.LinkedList;
import CollectionsADT.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertFirst(88);
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);


        linkedList.insertBefore(0, 50);
        linkedList.printAll();
        for (int x : linkedList) {
//            System.out.println(x);
        }


        Sorting sorting = new Sorting();
        Search search = new Search();
        ArrayQueue que = new ArrayQueue(10);

        que.enqueue(5);
        que.enqueue(8);
        que.enqueue(9);
        que.enqueue(4);
        que.enqueue(500);
        que.enqueue(500);
//       System.out.println( que.dequeue() + " deque");
//       System.out.println( que.size() + " deque");
//        que.print();

        Stack stack  = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
//        stack.print();

//        stack.print();

        int [] array = {12,1,10,50,5,15,45,0,88,-96};
        int [] ordered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};

//        System.out.print( search.BinarySearchRecursion(ordered, 17, 0, ordered.length-1));


    }
}


