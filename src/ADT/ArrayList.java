package ADT;

import Abstract.IList;

public class ArrayList<T> implements IList<T> {

    private T[] array;
    private int size = 0;

    public  ArrayList () {
        array = (T[]) new Object[10];
    };

    @Override
    public int size() {
        return size;
    };

    @Override
    public boolean isEmpty() {
        return (size == 0);
    };

    @Override
    public T first() {
        return array[0];
    };

    @Override
    public T last() {
        return array[size-1];
    };

    @Override
    public T prev(int p) {
        return array[p-1];
    }

    @Override
    public T next(int p) {
        return array[p+1];
    }

    @Override
    public T element(int p) {
        return array[p];
    }

    @Override
    public boolean iFirst(T e) {
        return e == array[0];
    }

    @Override
    public boolean isLast(T e) {
        return e == array[size -1];

    }

    @Override
    public void replaceElement(int p, T q) {
        if(array.length > 0) {
            array[p] = q;
        }
    }

    @Override
    public void swapElement(int p1, int p2) {
        T firstPosition =null;
        T secondPosition ;


        for(int i = 0; i < size; i++) {
            if(i == p1) {
                firstPosition =  array[i];
            }

            if(i == p2) {
                secondPosition = array[i];
                array[i] = firstPosition;
                array[p1] = secondPosition;
            }
        }
    }

    @Override
    public void insertBefore(int p, T e) {

        if( size == array.length ) {
            resize();
        }

        size++;

        for( int i = size-1; i >= p; i-- ) {
            array[i+1] = array[i];
        };

        array[p] = e;

    }

    @Override
    public void insertAfter(int p, T e) {
        if( size == array.length ) {
            resize();
        }

        size ++;

        for(int i = size-1 ; i >= p; i--) {
            array[i+1] = array[i];
        }

        array[p+1] = e;
    }

    @Override
    public void insertFirst(T e) {

        size ++;


        if( size == array.length ) {
            resize();

            System.out.println("size" + size);
            System.out.println("array.length" +array.length);
        }


        for (int i = size-1 ; i  >= 0 ; i --) {
            array[i+1] = array[i];
        }

        array[0] = e;

    }

    @Override
    public void insertLast(T e) {

        if( size == array.length ) {
            resize();
        }

        for(int i = size ; i >=0; i-- ){

            if(i == size) {
                array[i] = e;
            }
        }

        size ++;

    }

    @Override
    public void remove(int p) {

        array[p] = null;

        for(int i = p; i < size; i++) {

            array[i] = array[i+1];

        }
        size --;
    }

    @Override
    public void removeFirst() {

        array[0] = null;

        for(int i = 0; i < size; i++) {
            array[i] = array[i+1];
        }

        size --;

    }

    @Override
    public void removeLast() {
        array[array.length-1] = null;
        size --;
    }

    //
    private void resize() {

        T[] newArray = (T[])new Object[size * 2];

        for (int x = 0; x < array.length; x++) {
            newArray[x] = array[x];
        }

        array = newArray;
    }


}
