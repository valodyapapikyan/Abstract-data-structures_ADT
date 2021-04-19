package CollectionsADT;

import CollectionsADT.Abstract.IList;

public class LinkedList<T> implements IList<T> {

    private Node head;
    private int size;

    public LinkedList() {
       head = null;
       size = 0;
    }

    public class Node {

        private T value;
        private Node next;

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public int size() {
        return size;
    };


    public boolean isEmpty() {
        return (size == 0);
    }


    public T first() {
        Node _head = head;

        if(_head != null){
            return  _head.value;
        }

        return null;

    }


    public T last() {
        Node  temp = head;

        if (head == null) {
            return null;
        }

       while (temp.next != null) {
           temp = temp.next;
       }

       return temp.value;
    }



    public T prev(T p) {

        Node current = head;
        Node previous = null;

        while (current != null){

            if(current.value == p) {

                return previous.value;
            }

            previous = current;
            current = current.next;
        }

        return null;
    };


    public T next(T p) {

        Node current = head;

        while (current.next != null){

            if(current.value == p) {
                return current.next.value;
            }
            current = current.next;

        }

        return null;
    }


    public T element(int p) {
        Node current = head;
        int index = 0;

        while (current.next != null) {

           index ++;

           if(index == p) {
               return  current.value;
           }

           current = current.next;
        }
        return null;
    }


    public boolean iFirst(T e) {
        return false;
    }


    public boolean isLast(T e) {
        return false;
    }


    public void replaceElement(int p, T q) {

    }


    public void swapElement(int p1, int p2) {

    }


    public void insertBefore(int p, T e) {

    }


    public void insertAfter(int p, T e) {

    }


    public void insertFirst(T e) {
        if (head == null) {
            head = new Node(e,null);
            size  = size + 1;
            return;
        }

        Node nodeA = new Node(e, head);
        head = nodeA;
        size  = size + 1;

    }

    public void insertLast(T e) {
        Node nodeA = new Node(e, null);
    }


    public void remove(int p) {

    }


    public void removeFirst() {

    }


    public void removeLast() {

    }
}
