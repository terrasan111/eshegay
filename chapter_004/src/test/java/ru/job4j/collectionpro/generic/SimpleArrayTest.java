package ru.job4j.collectionpro.generic;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 18.03.2018.
 */
public class SimpleArrayTest {

    @Test
    public void whenAddObject() {
        SimpleArray one = new SimpleArray(1);
        one.add(1);
        assertThat(one.get(0), is(1));
    }

    @Test
    public void whenSetObject() {
        SimpleArray one = new SimpleArray(1);
        one.set(0, "hello");
        assertThat(one.get(0), is("hello"));
    }

    @Test
    public void whenDeleteObject() {
        SimpleArray one = new SimpleArray(1);
        one.add(1);
        assertThat(one.delete(0), is(true));
    }

    @Test
    public void whenGetObject() {
        SimpleArray one = new SimpleArray(1);
        one.set(0, "hello");
        assertThat(one.get(0), is("hello"));
    }

    @Test
    public void iteratorReturnFirstObject() {
        SimpleArray one = new SimpleArray(1);
        one.add("hello");
        assertThat(one.iterator().next(), is("hello"));



    }

}