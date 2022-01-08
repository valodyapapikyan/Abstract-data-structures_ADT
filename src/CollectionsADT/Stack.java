package CollectionsADT;

import CollectionsADT.Abstract.IStack;

import java.util.Iterator;

public class Stack<T> implements IStack<T>, Iterable<T> {

    private int DEFAULT_SIZE = 5;
    private int top = -1;
    private Object[] objects;

    public  Stack() {
        objects = new Object[DEFAULT_SIZE];
    }

    @Override
    public void push(T obj) {
        if (top < DEFAULT_SIZE) {
            top ++;
            objects[top] = obj;
        } else {
            System.out.println("Error : Stack overflow");
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void pop() {
        if (top >= 0) {
            top--;
        } else {
            System.out.println("Error : Stack is empty");
        }
    }

    @Override
    public T peak() {
        if(top == -1) {
            System.out.println("Error : Stack is empty");
        }

        return (T) objects[top];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public void print() {
        for (int x = 0; x < objects.length; x++)
            System.out.println(objects[x]);
    }

}
