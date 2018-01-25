package collections;

import java.util.TreeMap;


public class MultiHashSet<T> implements MultiSet<T>, Cloneable {
    TreeMap<T, Integer> data;

    public MultiHashSet() {
        this.data = new TreeMap<>();
    }

    public boolean add(T element) {
        if (this.data.containsKey(element)) {
            int tmp = this.data.get(element);
            this.data.put(element, tmp + 1);
        } else {
            this.data.put(element, 1);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.data.containsKey(o)) {
            this.data.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MultiHashSet && this.data.equals(o);
    }

    @Override
    public int hashCode() {
        return this.data.hashCode();
    }

    //pops min element and returns it
    public T popMinElement() {
        T minValue = this.data.firstKey();
        int minCount = this.data.get(this.data.firstKey());
        if (minCount > 1) {
            minCount--;
            this.data.put(minValue, minCount);
        } else if (minCount == 1) {
            this.data.remove(minValue);
        }
        return minValue;
    }

    public int size() {
        return this.data.size();
    }

    @Override
    public boolean isEmpty() {
        return this.data.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return this.data.containsKey(o);
    }

    @Override
    public Object[] toArray() {
        return this.data.keySet().toArray();
    }
}
