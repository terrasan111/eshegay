
package ru.job4j.collectionpro.list;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 24.03.2018.
 */

public class SimpleStackTest {

    @Test
    public void addItemSimpleStack() {
        Object[] objects = new Object[16];
        SimpleStack<String> simpleStack = new SimpleStack(objects);
        String a = "Hi";
        String b = "WOW";
        simpleStack.push(a);
        simpleStack.push(b);
        assertThat((simpleStack.poll()), is("WOW"));
        assertThat(simpleStack.poll(), is("Hi"));
    }

   @Test
    public void testForRemoveMethod() {
       Object[] objects = new Object[16];
        SimpleStack<String> simpleStack = new SimpleStack(objects);
        String a = "Hi";
        simpleStack.push(a);
        assertThat(simpleStack.remove(0), is("Hi"));
    }

    @Test
    public void testForGetMethod() {
        Object[] objects = new Object[16];
        SimpleStack<String> simpleStack = new SimpleStack(objects);
        String a = "Hi";
        String b = "WOW";
        simpleStack.push(a);
        simpleStack.push(b);
        assertThat((simpleStack.get(1)), is("WOW"));
        assertThat(simpleStack.get(0), is("Hi"));
    }

    @Test
    public void testForIterator() {
        Object[] objects = new Object[16];
        SimpleStack<String> simpleStack = new SimpleStack(objects);
        String a = "Hi";
        String b = "WOW";
        simpleStack.push(a);
        simpleStack.push(b);
        assertThat(simpleStack.iterator().hasNext(), is(true));
        assertThat(simpleStack.iterator().next(), is("Hi"));
        assertThat(simpleStack.iterator().hasNext(), is(true));
        assertThat(simpleStack.iterator().next(), is("WOW"));
        assertThat(simpleStack.iterator().hasNext(), is(false));
    }
}
