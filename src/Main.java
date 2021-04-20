import CollectionsADT.ArrayList;
import CollectionsADT.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


//        for(int i = 0; i < 10; i++) {
//            list.insertFirst(i);
//        }

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertFirst(88);
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.insertFirst(55);
        linkedList.insertFirst(40);

//         linkedList.replaceElement(0,555);

        for (int x:linkedList) {
            System.out.println(x);
        }



//        list.insertAfter(4,100);
//        list.insertBefore(6,200);
//        list.replaceElement(2,9);
//        list.swapElement(5,8);
//        list.isEmpty();
//        list.element(7);
//        list.remove(3);
//        list.next(5);
//        list.insertFirst(500);
//        ....




//        for(int a = 0; a < list.size(); a ++) {
//            System.out.println( list.element(a));
//        }




    }
}


