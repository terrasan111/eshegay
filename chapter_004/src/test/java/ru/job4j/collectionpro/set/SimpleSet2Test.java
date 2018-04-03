package ru.job4j.collectionpro.set;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 31.03.2018.
 */
public class SimpleSet2Test {

    @Test
    public void addItemInSimpleSet2() {

        SimpleSet2<String> set2 = new SimpleSet2<>();
        String one = "Tom";
        String three = "Jerry";
        String two = "Tom";
        set2.add(one);
        set2.add(two);
        set2.add(three);
        assertThat(set2.iterator().next(), is("Jerry"));
        assertThat(set2.iterator().next(), is("Tom"));

    }

    @Test
    public void testForIterator() {
        SimpleSet2<String> set2 = new SimpleSet2<>();
        String one = "Tom";
        String three = "Jerry";
        String two = "Tom";
        set2.add(one);
        set2.add(two);
        set2.add(three);
        assertThat(set2.iterator().hasNext(), is(true));
        assertThat(set2.iterator().next(), is("Jerry"));
        assertThat(set2.iterator().hasNext(), is(true));
        assertThat(set2.iterator().next(), is("Tom"));
        assertThat(set2.iterator().hasNext(), is(false));
    }

}