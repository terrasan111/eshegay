package ru.job4j.collectionpro.list;


import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by Evgeniy on 25.03.2018.
 */
public class SimpleQueueTest {

    @Test
    public void addItemSimpleQueue() {
        SimpleQueue<String> simpleQueue = new SimpleQueue<>();
        String a = "Hi";
        simpleQueue.push(a);
        assertThat(simpleQueue.get(0), is("Hi"));
    }

    @Test
    public void testForPollMethod() {
        SimpleQueue<String> simpleQueue = new SimpleQueue<>();
        String a = "Hi";
        simpleQueue.push(a);
        assertThat(simpleQueue.poll(), is("Hi"));
    }

}