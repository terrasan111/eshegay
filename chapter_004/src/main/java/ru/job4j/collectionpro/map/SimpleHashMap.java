package ru.job4j.collectionpro.map;

import java.util.*;

/**
 * Created by Evgeniy on 05.04.2018.
 */
public class SimpleHashMap<K, V> implements Iterable<V> {


    private Node<K, V>[]objects;
    private int size = 0;
    private float threshold;
    private int count = 0;
    private int count2 = 0;
    private K key;
    private V value;

    public SimpleHashMap() {
        this.objects = new Node[16];
        threshold = objects.length * 0.75f;
    }

    private class Node<K, V> {
        private int hash;
        private K key;
        private V value;


        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }



        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public boolean insert(K key, V value) {
     boolean result = false;

     if (size + 1 >= threshold) {
         threshold *= 2;
         arrayDoubling();
     }

     Node<K, V> newNode = new Node<>(key, value);
     int index = hash(key);
     if (objects[index] == null) {
         objects[index] = newNode;
         result = true;
         size++;
     }
     return result;
    }

    private void arrayDoubling() {
        Node<K, V>[] oldObjects = objects;
        objects = new Node[objects.length * 2];
        for (Node<K, V> temp : oldObjects) {
            if (temp != null) {
                    insert(temp.key, temp.value);
            }
        }
    }



   public V get(K key) {
        V temp = null;
      int index = hash(key);
      if (index < objects.length && objects[index] != null) {
           temp = objects[index].getValue();
      } else {
         temp = null;
      }

      return temp;
    }

   public boolean delete(K key) {
        boolean rsl = false;
       int index = hash(key);
      if (objects[index] == null) {
          return rsl;
      } else {
          if (key.equals(objects[index].getKey())) {
              objects[index] = null;
             rsl = true;
             size--;
          }
      }
       return rsl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SimpleHashMap<?, ?> that = (SimpleHashMap<?, ?>) o;

        if (key != null ? !key.equals(that.key) : that.key != null) {
            return false;
        }
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * 17 + key.hashCode();
        return hash;
    }


    public int hash(K key) {
        return key.hashCode() % objects.length;
    }

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public V next() {
                V res = null;
                int i = count2;
                for (; i < objects.length;) {
                    if (objects[i] == null) {
                        i++;
                    } else {
                        res = objects[i++].getValue();
                        count++;
                        count2 = i;
                        break;
                    }
                }
                return  res;
            }
        };
    }
}
