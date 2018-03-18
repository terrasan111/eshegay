package ru.job4j.collectionpro.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public class SimpleArray<T> implements Iterable<T> {

   private Object[] array;
   private int position = 0;
   private int i = 0;

    public SimpleArray(int size) {
        this.array = new Object[size];
    }

    public void add(T model) {

      array[position] = model;
      position++;
    }

    public void set(int index, T model) {
        if (index < array.length) {
            array[index] = model;
        }
    }

    public boolean delete(int index) {
        boolean temp = false;
        if (index < array.length) {
            array[index] = null;
            temp = true;
        }
        return temp;
    }

   public T get(int index) {
       return (T) array[index];
   }


    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            @Override
            public boolean hasNext() {
                boolean temp = false;
                if (array[i] != null) {
                    temp = true;
                }
                return temp;
            }

            @Override
            public T next() {
                if (array[i] == null) {
                    throw new NoSuchElementException();
                }
                return (T) array[i++];
            }
        };
    }
}
