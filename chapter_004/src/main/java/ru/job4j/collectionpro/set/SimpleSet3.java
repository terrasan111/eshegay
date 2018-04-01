package ru.job4j.collectionpro.set;

import java.util.Arrays;

/**
 * Created by Evgeniy on 01.04.2018.
 */
public class SimpleSet3<E> {

    private Object[] objects = new Object[16];
    private int size = 0;
    private E value;
    private int index = 0;
    private int count = 0;

    public SimpleSet3(Object[] objects) {
        this.objects = objects;
    }

    public boolean add(E e) {
        boolean result = false;
          if (size == 0) {
              objects[0] = e;
              size++;
              result = true;
              return result;
          }
          for (int i = 0; i < objects.length; i++) {
              E temp = (E) objects[i];
              if (temp.hashCode() != e.hashCode()) {
                  index = hash(e);
                  objects[index] = e;
                  size++;
                  result = true;
                  break;
              }
          }
          if (size == objects.length - 1) {
              Arrays.copyOf(objects, (objects.length * 3) / 2 + 1);
          }

       return result;
    }


     public  boolean contains(E e) {
          boolean res = false;
          for (int i = 0; i < objects.length; i++) {
              E temp =  (E) objects[i];
              if (temp.hashCode() == e.hashCode()) {
                  res = true;
                  break;
              }
          }
          return res;
     }

      public  boolean remove(E e) {
         boolean rsl = false;
         for (int i = 0; i < objects.length; i++) {
             E temp = (E) objects[count++];
             if (temp.hashCode() == e.hashCode()) {
                 i = --count;
                 objects[i] = null;
                 rsl = true;
                 count++;
                 break;
             }
         }
         return rsl;
      }



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
