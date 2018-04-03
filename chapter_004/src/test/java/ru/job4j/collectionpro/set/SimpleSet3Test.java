package ru.job4j.collectionpro.set;


import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by Evgeniy on 01.04.2018.
 */
public class SimpleSet3Test {

   // данный тест тестирует сразу два метода add и contains

    @Test
    public void addItemInSimpleSet3() {
        Object[]objects = new Object[16];
        SimpleSet3<String> set3 = new SimpleSet3<>(objects);
        String one = "Hello";
        String two = "Friend";
        set3.add(one);
        set3.add(two);
        assertThat(set3.contains(one), is(true));
        assertThat(set3.contains(two), is(true));
    }

    @Test
    public void testForRemove() {
        Object[]objects = new Object[16];
        SimpleSet3<String> set3 = new SimpleSet3<>(objects);
        String one = "Hi";
        String two = "Start";
        set3.add(one);
        set3.add(two);
        assertThat(set3.remove(one), is(true));
        assertThat(set3.remove(two), is(true));
    }
}