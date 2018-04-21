package ru.job4j.collectionpro.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeniy on 13.04.2018.
 */
public class Node<E extends    Comparable<E>> {
    private E value;
    private final  List<Node<E>> children = new ArrayList<>();
    private int size = 0;

    public Node(E value) {
        this.value = value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void add(Node<E> child) {
        this.children.add(child);
        size++;
    }

    public int size() {
        return size;
    }

    public List<Node<E>> leaves() {
        return this.children;
    }

    public boolean eqValue(E that) {
        return this.value.compareTo(that) == 0;

    }

}
