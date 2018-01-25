

package collections;

public interface MultiSet<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Object[] toArray();

    boolean add(E e);

    boolean remove(Object o);

    void clear();

    boolean equals(Object o);

    int hashCode();
}
