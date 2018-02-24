package ru.job4j.collectionpro;

import org.junit.Test;
import java.util.NoSuchElementException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EvenIterator3Test {

    @Test
    public void sequentialHasNextInvocationDoesntAffectRetrievalOrder() {
        EvenIterator3 it = new EvenIterator3();
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(6));
    }

}