package collections;

import java.util.TreeMap;

/**
 * Created by Kir Tribunskiy on 10.10.14.
 * mail: forty-7@yandex.ru
 * whatsapp: +7 917 981 55 64
 */
public class MultiTreeSet<T> {
    TreeMap<T, Integer> data;

    public MultiTreeSet() {
        this.data = new TreeMap<>();
    }

    public void add(T element) {
        if (this.data.containsKey(element)) {
            int tmp = this.data.get(element);
            this.data.put(element, tmp + 1);
        } else {
            this.data.put(element, 1);
        }
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
}