package CollectionsADT;

import CollectionsADT.Abstract.IThree;

import java.util.Iterator;

public class BinaryThree<T extends Comparable<T>> implements IThree<T>, Iterable<T> {


    @Override
    public Iterator<T> iterator() {
        return new InOrderIterator();
    }

    private class Node<T> {
        private T value;
        private Node<T> left = null;
        private Node<T> right = null;

        //constructor
        public Node(T value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    Node root;


    public void insert(T v) {

        insertRecursive(root, v);

    }

    Node insertRecursive(Node node, T value) {

        if (this.root == null) {
            this.root = new Node(value, null, null);
            return this.root;
        }


        if (value.compareTo((T) node.value) < 0) {
            if (node.left == null) {
                Node n = new Node(value, null, null);
                node.left = n;
                return n;
            }
            node.left = insertRecursive(node.left, value);

        }

        if (value.compareTo((T) node.value) > 0) {
            if (node.right == null) {
                Node n = new Node(value, null, null);
                node.right = n;
                return n;
            }
            node.right = insertRecursive(node.right, value);
        }


        return node;
    }


    public void remove(T v) {

    }


    public boolean contains(T v) {
        return false;
    }


    //helper
    public ArrayList inOrderSubThree(Node element, ArrayList snapshot) {


        if (element.left != null) {
            inOrderSubThree(element.left, snapshot);
        }


        if (element.right != null) {
            inOrderSubThree(element.right, snapshot);

        }

        snapshot.insertLast(element.value);


        return snapshot;
    }

    ;

    //In order iteration
    private ArrayList<T> InOrder() {

        ArrayList<T> s = new ArrayList<>();

        if (root == null) {
            return s;
        }


        return inOrderSubThree(root, s);
    }

    private class InOrderIterator implements Iterator<T> {

        ArrayList<T> list = InOrder();
        T pointer = list.first();


        public boolean hasNext() {
            return (pointer != null);
        }


        int position = 0;

        public T next() {

            if (hasNext()) {
                T temp = pointer;

                pointer = list.nextWithPosition(position++);
                return temp;
            }

            return null;
        }
    }


}
