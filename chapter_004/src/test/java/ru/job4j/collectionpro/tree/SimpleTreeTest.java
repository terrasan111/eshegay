package ru.job4j.collectionpro.tree;


import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


/**
 * Created by Evgeniy on 15.04.2018.
 */
public class SimpleTreeTest {

    @Test
    public void when6ElFindLastThen6() {
        Node<Integer> root = new Node(1);
        Tree<Integer> tree = new Tree();
        Node<Integer> two = new Node(2);
        Node<Integer> three = new Node(3);
        Node<Integer> four = new Node(4);
        Node<Integer> five = new Node(5);
        Node<Integer> six = new Node(6);
        tree.add(root, two);
        tree.add(root, three);
        tree.add(root, four);
        tree.add(four, five);
        tree.add(five, six);
        assertThat(tree.findBy(6).isPresent(), is(true));
    }

    @Test
    public void when6ElFindNotExitThenOptionEmpty() {
        Node<Integer> root = new Node(1);
        Node<Integer> two = new Node(2);
        Tree<Integer> tree = new Tree<>();
        tree.add(root, two);
        assertThat(tree.findBy(7).isPresent(), is(false));
    }

    @Test
    public void testForIterator() {
        Node<Integer> root = new Node(1);
        Tree<Integer> tree = new Tree();
        Node<Integer> two = new Node(2);
        Node<Integer> three = new Node(3);
        Node<Integer> four = new Node(4);
        Node<Integer> five = new Node(5);
        Node<Integer> six = new Node(6);
        tree.add(root, two);
        tree.add(root, three);
        tree.add(root, four);
        tree.add(four, five);
        tree.add(five, six);
        assertThat(tree.iterator().hasNext(), is(true));
        assertThat(tree.iterator().next(), is(1));
        assertThat(tree.iterator().hasNext(), is(true));
        assertThat(tree.iterator().next(), is(2));
        assertThat(tree.iterator().hasNext(), is(true));
        assertThat(tree.iterator().next(), is(3));
        assertThat(tree.iterator().hasNext(), is(true));
        assertThat(tree.iterator().next(), is(4));
        assertThat(tree.iterator().hasNext(), is(true));
        assertThat(tree.iterator().next(), is(5));
        assertThat(tree.iterator().hasNext(), is(true));
        assertThat(tree.iterator().next(), is(6));
        assertThat(tree.iterator().hasNext(), is(false));
    }
}