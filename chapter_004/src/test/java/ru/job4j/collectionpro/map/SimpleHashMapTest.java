package ru.job4j.collectionpro.map;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by Evgeniy on 05.04.2018.
 */
public class SimpleHashMapTest {



    @Test
    public void whenInsertAndGetItem() {

        SimpleHashMap<Integer, String> simpleHashMap = new SimpleHashMap<>();
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        String one2 = "Weather";
        String two2 = "Today";
        String three2 = "Cold";
        simpleHashMap.insert(one, one2);
        simpleHashMap.insert(two, two2);
        simpleHashMap.insert(three, three2);
        assertThat(simpleHashMap.get(one), is("Weather"));
        assertThat(simpleHashMap.get(two), is("Today"));
        assertThat(simpleHashMap.get(three), is("Cold"));
    }

    @Test
    public void whenInsertItemAndDelete() {
        SimpleHashMap<Integer, String> simpleHashMap = new SimpleHashMap<>();
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        String one2 = "Weather";
        String two2 = "Today";
        String three2 = "Cold";
        simpleHashMap.insert(one, one2);
        simpleHashMap.insert(two, two2);
        simpleHashMap.insert(three, three2);
        assertThat(simpleHashMap.delete(three), is(true));
        assertThat(simpleHashMap.delete(one), is(true));
        assertThat(simpleHashMap.delete(two), is(true));
    }

    @Test
    public void testForIterator() {
        SimpleHashMap<Integer, String> simpleHashMap = new SimpleHashMap<>();
        Integer one = 11;
        Integer two = 20;
        Integer three = 13;
        String one2 = "Weather";
        String two2 = "Today";
        String three2 = "Cold";
        simpleHashMap.insert(one, one2);
        simpleHashMap.insert(two, two2);
        simpleHashMap.insert(three, three2);
        assertThat(simpleHashMap.iterator().hasNext(), is(true));
        assertThat(simpleHashMap.iterator().next(), is("Today"));
        assertThat(simpleHashMap.iterator().hasNext(), is(true));
        assertThat(simpleHashMap.iterator().next(), is("Weather"));
        assertThat(simpleHashMap.iterator().hasNext(), is(true));
        assertThat(simpleHashMap.iterator().next(), is("Cold"));
        assertThat(simpleHashMap.iterator().hasNext(), is(false));
    }

}