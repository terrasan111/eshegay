
package ru.job4j.collectionpro.list;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleQueue<E>  implements Iterable<E> {


    protected Object[] objects;
    private int index = 0;
    private int index2 = 0;
    private int modCount = 0;
    private int i = 0;

    public SimpleQueue(Object[] objects) {
        this.objects = objects;
    }

    // добавляет элемент в очередь

       public void push(E value) {
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

    public E remove() {
        E res = null;
        res = (E) objects[index2];
        objects[index2++] = null;
        if (res == null) {
            throw new NoSuchElementException();
        }
        return res;
    }


    public E poll() {
       E result;
       if (objects[index2] != null) {
           result =  (E) objects[index2];
           objects[index2++] = null;

       } else {
           result = null;
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


