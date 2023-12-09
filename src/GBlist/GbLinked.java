package GBlist;

public interface GbLinked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementIndex(int counter);

}

