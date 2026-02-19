
package list;

public interface List<T> {

    int size();
    boolean isEmpty();
    void addLast(T element);
    void addFirst(T element);
    void addAtIndex(int index, T element);
    T get(int i);


}
