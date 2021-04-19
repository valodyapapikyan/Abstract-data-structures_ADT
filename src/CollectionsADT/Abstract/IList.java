package CollectionsADT.Abstract;

public interface IList<T> {

    //generic methods

    public  int size();
    public boolean isEmpty();


    //accessor methods

    public T first();
    public  T last();
    public  T prev(T p);
    public  T next(int p);
    public  T element(int p);

    //query methods

    public boolean iFirst(T e);
    public boolean isLast(T e);


    //update methods

    public void replaceElement(int p, T q);
    public void swapElement(int p1, int p2);
    public void insertBefore(int p, T e);
    public void insertAfter(int p, T e);
    public void insertFirst(T e);
    public void insertLast(T e);
    public void remove(int p);
    public void removeFirst();
    public void removeLast();


}
