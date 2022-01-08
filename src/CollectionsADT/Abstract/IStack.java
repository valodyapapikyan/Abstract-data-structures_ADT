package CollectionsADT.Abstract;

public interface IStack<T> {
    public void push(T obj);
    public boolean isEmpty();
    public void pop();
    T peak();
}
