package ru.job4j.collectionpro.set;

import ru.job4j.collectionpro.list.List;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by Evgeniy on 31.03.2018.
 */
public class SimpleSet<E>  extends List<E> {

    private int index2 = 0;
    private int size = 0;

    public SimpleSet(Object[] objects) {
        super(objects);
    }

    public boolean contains(E value) {
       boolean result = false;
        for (int i = 0; i < objects.length; i++) {
            E temp = (E) objects[i];
           boolean temp2 = temp.equals(value);
            if (temp2) {
                result = true;
                break;
            }
        }
        return result;
    }




    @Override
    public void add(E value) {
        int index = 0;
        E object = (E) objects[index];
        if (object == null) {
            objects[index2++] = value;
            size++;
            return;
        }
        if (object != null) {
            int count = 0;
            for (int j = 0; j < objects.length; j++) {
                E val = (E) objects[j];
                boolean temp = value.equals(val);
                if (temp) {
                    return;
                }
                if (!temp && count == objects.length - 1) {
                    objects[index2++] = value;
                    size++;
                    break;
                }
                count++;
            }

        }
        if (size == objects.length) {
            Arrays.copyOf(objects, ((objects.length * 3) / 2) + 1);
        }

    }
}


