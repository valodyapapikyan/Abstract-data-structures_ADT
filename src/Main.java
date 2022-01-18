import Alghoritms.search.Search;
import Alghoritms.sorting.Sorting;
import CollectionsADT.*;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        BinaryThree<Integer> three = new BinaryThree<>();

        three.insert(10);
        three.insert(7);
        three.insert(5);
        three.insert(8);



        Iterator<Integer> it = three.iterator();


        while (it.hasNext()) {
            System.out.println(it.next());
        }




//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        linkedList.insertFirst(88);
//        linkedList.insertFirst(10);
//        linkedList.insertFirst(20);
//
//
//        linkedList.insertBefore(0, 50);
//        linkedList.printAll();


        Sorting sorting = new Sorting();
        Search search = new Search();
        ArrayQueue que = new ArrayQueue(10);

        que.enqueue(5);
        que.enqueue(8);
        que.enqueue(9);
        que.enqueue(4);
        que.enqueue(500);
        que.enqueue(500);

        Stack stack  = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();


        int [] array = {5,8,3,9,1,0};
        int [] ordered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};




    }
}


