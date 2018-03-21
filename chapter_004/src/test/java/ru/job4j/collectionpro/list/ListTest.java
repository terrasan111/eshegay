package ru.job4j.collectionpro.list;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 21.03.2018.
 */
public class ListTest {

    @Test
    public void whenAddItem() {
        Object[] one = new Object[100];
        List list = new List(one);
        int a = 5;
        list.add(a);
        assertThat(list.get(0), is(5));
    }

    @Test
    public void whenGetItemByIndex() {
        Object[] one = new Object[100];
        List list = new List(one);
        int a = 5;
        int b = 10;
        list.add(a);
        list.add(b);
        assertThat(list.get(1), is(10));
    }

    @Test
    public void testForIterator() {
        Object[] objects = new Object[] {"Morning", "Afternoon", "Evening", "Night"};
        List list = new List(objects);
        assertThat(list.iterator().hasNext(), is(true));
        assertThat(list.iterator().next(), is("Morning"));
        assertThat(list.iterator().hasNext(), is(true));
        assertThat(list.iterator().next(), is("Afternoon"));
        assertThat(list.iterator().hasNext(), is(true));
        assertThat(list.iterator().next(), is("Evening"));
        assertThat(list.iterator().hasNext(), is(true));
        assertThat(list.iterator().next(), is("Night"));
    }



}