package ru.job4j.collectionpro.set;

import ru.job4j.collectionpro.list.Node;

import java.util.Iterator;

/**
 * Created by Evgeniy on 31.03.2018.
 */
public class SimpleSet2<E> implements  Iterable<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    private int count = 0;

    public SimpleSet2() {
        this.first = new Node(null, last, null);
        this.last = new Node(null, null, first);
    }

    public boolean equals(Object value, Object value2) {
        return value.equals(value2);
    }



    public void add(Object value) {
        if (size == 0) {
            Node<E> prev = first;
            prev.setItem((E) value);
            first = new Node(null, prev, null);
            prev.setPrev(first);
            size++;
            return;
        }

        boolean result = false;
        int i = 0;
        while (i <= size) {

            Node temp = first.getNext();
            E tmp = (E) temp.getItem();
            result = equals(tmp, value);
            if (result) {
                break;
            }
            temp = ifSimpleSet2HaveDublicates(temp);
            if (temp != null) {
                E tmp2 = (E) temp.getItem();
                result = equals(temp, value);
                if (result) {
                    break;
                }
            }
            i++;
        }
        if (!result) {
            Node<E> prev = first;
            prev.setItem((E) value);
            first = new Node(null, prev, null);
            prev.setPrev(first);
            size++;
        }


    }
  // метод создал чисто для теста только
    public E get(int index) {
        Node<E> temp = first.getNext();
        for (int i = 0; i < index; i++) {
            temp = ifSimpleSet2HaveDublicates(temp);
        }
        return temp.getItem();
    }

    private Node<E> ifSimpleSet2HaveDublicates(Node value) {
        return value.getNext();
    }

    private class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
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
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                return get(count++);
            }
        };
    }
}
