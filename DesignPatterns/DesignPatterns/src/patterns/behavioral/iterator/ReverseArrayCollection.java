package patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 提供一种方法顺序访问一个聚合对象中的各个元素，而又不需要暴露该对象的内部表示。
 */
public class ReverseArrayCollection<T> implements Iterable<T> {

    private T[] array;

    @SafeVarargs
    public ReverseArrayCollection(T... objects) { this.array = Arrays.copyOfRange(objects, 0, objects.length); }
    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator();
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        public ReverseIterator() { this.index = ReverseArrayCollection.this.array.length; }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return array[index];
        }
    }
}
