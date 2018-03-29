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
        SimpleStack<String> simpleStack = new SimpleStack();
        String a = "Hi";
        simpleStack.push(a);
        assertThat((simpleStack.poll()), is("Hi"));
    }

    @Test
    public void testForPollMethod() {
        SimpleStack<String> simpleStack = new SimpleStack();
        String a = "Hi";
        simpleStack.push(a);
        assertThat(simpleStack.poll(), is("Hi"));
    }

}