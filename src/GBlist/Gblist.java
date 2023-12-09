package GBlist;

public interface Gblist <T>{
    /***
     * добавляет в конец коллекции item тип T
     * @param item
     * @return
     */
    Gblist<T> add(T item);
    T get(int index);
    Gblist<T> remove(int index);
    boolean update(T item, int index);
    int size();
    boolean isEmpty();


}
