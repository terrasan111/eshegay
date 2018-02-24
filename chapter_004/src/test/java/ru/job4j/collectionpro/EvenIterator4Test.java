package ru.job4j.collectionpro;


import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EvenIterator4Test {

    @Test
    public void  shouldReturnFalseIfNoAnyEvenNumbers() {
        EvenIterator4 it = new EvenIterator4();
        assertThat(it.hasNext(), is(false));
    }

}