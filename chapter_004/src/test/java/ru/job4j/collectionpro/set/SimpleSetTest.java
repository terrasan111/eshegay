package ru.job4j.collectionpro.set;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 31.03.2018.
 */
public class SimpleSetTest {

    @Test
    public void whenAddItemInSimpleSet() {
        Object[]objects = new Object[5];
        SimpleSet<String> set = new SimpleSet<>(objects);
        String one = "Tom";
        String  two = "Deil";
        String three = "Tom";
        String four = "Jerry";
        set.add(one);
         set.add(two);
         set.add(three);
         set.add(four);
         assertThat(set.get(0), is("Tom"));
         assertThat(set.get(1), is("Deil"));
         assertThat(set.get(2), is("Jerry"));
    }

    @Test
    public void testForIterator() {
        Object[]objects = new Object[5];
        SimpleSet<String> set = new SimpleSet<>(objects);
        String one = "Tom";
        String  two = "Deil";
        String three = "Tom";
        String four = "Jerry";
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        assertThat(set.iterator().hasNext(), is(true));
        assertThat(set.iterator().next(), is("Tom"));
        assertThat(set.iterator().hasNext(), is(true));
        assertThat(set.iterator().next(), is("Deil"));
        assertThat(set.iterator().hasNext(), is(true));
        assertThat(set.iterator().next(), is("Jerry"));
        assertThat(set.iterator().hasNext(), is(false));
    }
}