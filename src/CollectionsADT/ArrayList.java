package CollectionsADT;

import CollectionsADT.Abstract.IList;

public class ArrayList<T> implements IList<T> {

    private T[] array;
    private int size = 0;

    public  ArrayList () {
        array = (T[]) new Object[10];
    };

    public int size() {
        return size;
    };

    public boolean isEmpty() {
        return (size == 0);
    };

    public T first() {
        return array[0];
    };

    public T last() {
        return array[size-1];
    };

    public T prev(T p) {

        for(int i = 0; i < array.length; i++) {
            if(array[i] == p) {
                return array[i -1];
            }
        };

        return null;
    }

    public T next(T p) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == p) {
                return array[i +1];
            }
        };

        return null;
    }

    public T element(int p) {
        return array[p];
    }

    public boolean iFirst(T e) {
        return e == array[0];
    }


    public boolean isLast(T e) {
        return e == array[size -1];

    }


    public void replaceElement(int p, T q) {
        if(array.length > 0) {
            array[p] = q;
        }
    }


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


    public void remove(int p) {

        array[p] = null;

        for(int i = p; i < size; i++) {

            array[i] = array[i+1];

        }
        size --;
    }


    public void removeFirst() {

        array[0] = null;

        for(int i = 0; i < size; i++) {
            array[i] = array[i+1];
        }

        size --;

    }


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
