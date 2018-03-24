package ru.job4j.collectionpro.list;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 24.03.2018.
 */
public class MyLinkedListTest {

    @Test
    public void whenAddItemMyLinkedList() {
        MyLinkedList test = new MyLinkedList();
        Integer a = 100;
        assertThat(test.add(a), is(true));
    }

    @Test
    public void whenGetItemByIndex() {
        MyLinkedList test = new MyLinkedList();
        Integer a = 100;
        test.add(a);
        assertThat(test.get(0), is(100));

    }

    @Test
    public void testForIterator() {
        MyLinkedList test = new MyLinkedList();
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        test.add(a);
        test.add(b);
        test.add(c);
        assertThat(test.iterator().hasNext(), is(true));
        assertThat(test.iterator().next(), is(30));
        assertThat(test.iterator().hasNext(), is(true));
        assertThat(test.iterator().next(), is(20));
        assertThat(test.iterator().hasNext(), is(true));
        assertThat(test.iterator().next(), is(10));
    }

}