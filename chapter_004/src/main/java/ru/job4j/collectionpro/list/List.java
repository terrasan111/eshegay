
package ru.job4j.collectionpro.list;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class List<E> implements Iterable<E> {


    private Object[] objects;
    private int index = 0;
    private int modCount = 0;
    private int i = 0;

    public List(Object[] objects) {
        this.objects = objects;
    }

    public void add(E value) {
       objects[index] = value;
       index++;
       modCount++;
        if (index == objects.length) {
            Arrays.copyOf(objects, ((objects.length * 3) / 2) + 1);
        }
    }

    public E get(int index) {
      E result = null;
      if (index >= 0 && index < objects.length) {
          result = (E) objects[index];
      }
        return result;
    }


    @Override
    public Iterator<E> iterator() {
       final int expectedModCount = modCount;
        if (expectedModCount != modCount) {
            throw new ConcurrentModificationException();
        }
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                boolean temp = false;
                if (objects[i] != null) {
                    temp = true;
                }
                return temp;
            }

            @Override
            public E next() {
                if (objects[i] == null) {
                    throw new NoSuchElementException();
                }
                return (E) objects[i++];
            }
        };
    }
}

