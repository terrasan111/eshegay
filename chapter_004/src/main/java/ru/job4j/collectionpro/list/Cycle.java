package ru.job4j.collectionpro.list;

/**
 * Created by Evgeniy on 25.03.2018.
 */


public class Cycle<T> {

    private int size = 0;
    private Node<T> first;

    public Node<T> getFirst() {
        return first;
    }

    public void add(Object value) {
      if (first == null) {
          this.first = new Node(value);
      } else {
          Node temp = first;
          while (temp.getNext() != null) {
              temp = temp.getNext();
          }
           temp.setValue(new Node(value));
          size++;
      }

    }

    public T get(int index) {
        Node<T> temp = first.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNextElement(temp);
        }

        return temp.getValue();
    }

    private Node<T> getNextElement(Node<T> value) {
        return value.getNext();
    }


    private  class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    boolean hasCycle(Node first) {
       Node tort = first;
       Node hare = first.next;
       while (true) {
           if (tort.next == null) {
               break;
           }
           if (tort == hare) {
               return true;
           }
           tort = tort.next;
           hare = hare.next.next;
       }
       return false;
    }
}

