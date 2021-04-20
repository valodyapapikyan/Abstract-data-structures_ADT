package CollectionsADT;

import CollectionsADT.Abstract.IList;

import java.util.Iterator;

public class LinkedList<T> implements IList<T>, Iterable<T>{

    private Node head;
    private int size;

    public LinkedList() {
       head = null;
       size = 0;
    }

    private class LinkedListIterator<T> implements Iterator<T> {

        Node currentNode = head;

        public boolean hasNext() {
           return currentNode.next != null;
        }


        public T next() {
            if(hasNext()) {
                T value = (T) currentNode.value;
                currentNode = currentNode.next;
                return value;
            }
            return  null;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>();
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

       Node current = head;

       if(current.value == e) {
           return true;
       }

       return false;
    }


    public boolean isLast(T e) {
        Node current = head;

        while(current.value != e) {
            if(current.next == null) {
                return true;
            }

            current = current.next;
        }
        return false;
    }


    public void replaceElement(int p, T q) {

        int index = 0;
        Node current = head;

        while(current.next != null) {


            if(index == p) {
                current.value = q;
            }

            current = current.next;
            index ++;
        }

    }


    public void swapElement(int p1, int p2) {
        Node current = head;

        Node p1Node = null;
        Node p2Node = null;
        Node temp = null;

        int  index = 0;

        while (current != null) {

            if(index == p1)
                p1Node = current;

            if(index == p2)
                p2Node = current;

            current = current.next;
            index++;
        }

        temp = p1Node;
        p1Node = p2Node;
        p2Node = temp;
    }


    public void insertBefore(int p, T e) {

    }


    public void insertAfter(int p, T e) {

    }


    public void insertFirst(T e) {
        if (head == null) {
            head = new Node(e,null);
            size ++;
            return;
        }

        Node nodeA = new Node(e, head);
        head = nodeA;
        size ++;

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
