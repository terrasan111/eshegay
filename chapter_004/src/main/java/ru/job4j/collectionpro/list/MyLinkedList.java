package ru.job4j.collectionpro.list;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by Evgeniy on 24.03.2018.
 */
public class MyLinkedList<E> implements SimpleContainer {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;
    private int count = 0;

    public MyLinkedList() {
        first = new Node(null, null, last);
        last = new Node(first, null, null);
    }

    private  class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    @Override
    public boolean add(Object value) {
        Node<E> prev = first;
        prev.setItem((E) value);
        first = new Node(null, null, prev);
        prev.setPrev(first);
        size++;
        return true;
    }

    @Override
    public E get(int index) {
       Node<E> temp = first.getNext();
       for (int i = 0; i < index; i++) {
           temp = getNextElement(temp);
       }
        
         return temp.getItem();
    }

    private Node<E> getNextElement(Node<E> value) {
        return value.getNext();
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                if (count == size) {
                    throw new NoSuchElementException();
                }
                return get(count++);
            }
        };
    }


}
