package ru.job4j.collectionpro.set;

import ru.job4j.collectionpro.list.List;
import java.util.Iterator;


/**
 * Created by Evgeniy on 31.03.2018.
 */
public class SimpleSet<E> extends List<E> implements Iterable<E> {

    private int count = 0;
    private int size = 0;
    private Object[] objects;
    private int index2 = 0;

    public SimpleSet(Object[] objects) {
        super(objects);
       this.objects = objects;
    }

    public boolean equals(Object obj, Object value) {
        return obj.equals(value);
    }

    @Override
    public void add(E value) {
        int index = 0;
        while (index < objects.length) {
            E object = (E) objects[index];
            if (object == null && index != objects.length - 1) {
                index++;
                continue;
            }
            if (object == null) {
                objects[index2++] = value;
                size++;
            }
            if (object != null) {
                boolean temp = equals(object, value);
                if (temp) {
                    return;
                }
                if (!temp) {
                    objects[index2++] = value;
                    size++;
                }
            }
            break;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                return (E) objects[count++];
            }
        };
    }



}
