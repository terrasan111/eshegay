package ru.job4j.collectionpro.set;

import java.util.Arrays;

/**
 * Created by Evgeniy on 01.04.2018.
 */
public class SimpleSet3<E> {

    private Object[] objects = new Object[16];
    private int size = 0;
    private int count = 0;
    private E value;

    public SimpleSet3(Object[] objects) {
        this.objects = objects;
    }

    public boolean add(E value) {
        boolean temp = true;
        boolean result = false;
        if (!contains(value)) {
            objects[hash(value)] = value;
            result = true;
            size++;
            return result;
        }
          if (size == objects.length - 1) {
              Arrays.copyOf(objects, (objects.length * 3) / 2 + 1);
          }
       return result;
    }


     public  boolean contains(E value) {
          boolean res = false;
              for (int j = 0; j < objects.length; j++) {
                  E temp2 = (E) objects[j];
                  if (temp2 == null) {
                      continue;
                  }
                  if (temp2 != null) {
                      boolean rsl = temp2.equals(value);
                      if (rsl) {
                          res = true;
                          count = j;
                          break;
                      }
                  }
              }
          return res;
     }

      public  boolean remove(E value) {
         boolean rsl = false;
         boolean tmp = false;
         tmp = contains(value);
         if (tmp) {
             objects[count] = null;
             size--;
             rsl = true;
         }
         return rsl;
      }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * 17 + value.hashCode();
        return hash;
    }

    private int hash(E value) {
        int hash = 31;
        hash = hash * 17 + value.hashCode();
        return hash % objects.length;
    }
}
