package CollectionsADT;

import CollectionsADT.Abstract.Queue;

import java.util.Iterator;

public class ArrayQueue<T> implements Queue<T>, Iterable<T> {

    private int size;
    private int first = 0;
    private Object[] objects;


    public ArrayQueue(int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid Capacity!");
        }

        objects = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        for (int x = 0; x < objects.length; x++)
            System.out.println(objects[x]);
    }

    @Override
    public void enqueue(T obj) {
        int avail = (this.first + this.size) % objects.length;
        objects[avail] = obj;
        size++;
    }

    public T first() {
        return isEmpty() ? null : (T) objects[first];
    }

    @Override
    public T dequeue() {

        T element = (T) objects[first];
        first = (first + 1) % objects.length;
        size--;


        return element;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
