package ru.job4j.collectionpro.list;


/**
 * Created by Evgeniy on 24.03.2018.
 */
public class SimpleStack<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;


    public SimpleStack() {
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


    public boolean add(Object value) {
        Node<E> prev = last;
        prev.setItem((E) value);
        last = new Node(prev, null, null);
        prev.setNext(last);
        size++;
        return true;
    }


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


    public E  poll() {
     final Node<E> result = last.getPrev();
      return (result.getItem() == null) ? null : helpForPoll(result);
    }

    //  метод извлекает элемент из головы стека(т.е начиная с правого крайнего элемента)
    private E helpForPoll(Node<E> value) {
        final E element = value.item;
        value.prev = null;
        value.item = null;
        value.next = null;
        last = new Node(last.getPrev().getPrev(), null, null);
        size--;
        return element;
    }

    public void push(E value) {

        Node<E> prev = last;
        prev.setItem((E) value);
        last = new Node(prev, null, null);
        prev.setNext(last);
        size++;

    }


}
