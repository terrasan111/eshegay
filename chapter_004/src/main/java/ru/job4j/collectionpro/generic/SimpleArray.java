package ru.job4j.collectionpro.generic;

import java.util.Iterator;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public class SimpleArray<T> implements Iterable<T> {

   private Object [] array ;
   private int position = 0;

    public SimpleArray(int size) {
        this.array = new Object[size];
    }

    public void add(T model) {

      array[position] = model;
      position++;
    }

    public void set(int index, T model) {
       for (int i = 0; i < array.length; i++) {
           if (i == index) {
               add(model);
               break;
           }
       }
    }

    public void delete(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
               T temp = get(index);
               temp = null;
                break;
            }
        }
    }

   public T get(int index) {

       return this.array[index];
   }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
