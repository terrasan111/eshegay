
package ru.job4j.collectionpro.list;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleQueueTest {

    @Test
    public void addItemSimpleQueue() {
        Object[] objects = new Object[16];
        SimpleQueue<String> simpleQueue = new SimpleQueue<>(objects);
        String a = "Hi";
        String b = "Jack";
        simpleQueue.push(a);
        simpleQueue.push(b);
        assertThat(simpleQueue.get(0), is("Hi"));
        assertThat(simpleQueue.get(1), is("Jack"));
    }

    @Test
    public void testForPollMethod() {
        Object[] objects = new Object[16];
        SimpleQueue<String> simpleQueue = new SimpleQueue<>(objects);
        String a = "Hi";
        String b = "Jack";
        simpleQueue.push(a);
        simpleQueue.push(b);
        assertThat(simpleQueue.poll(), is("Hi"));
        assertThat(simpleQueue.poll(), is("Jack"));
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

    @Test
    public void whenRemoveItem() {
        Object[] objects = new Object[16];
        SimpleQueue<String> simpleQueue = new SimpleQueue<>(objects);
        String a = "Hi";
        String b = "Jack";
        simpleQueue.push(a);
        simpleQueue.push(b);
        assertThat(simpleQueue.remove(), is("Hi"));
        assertThat(simpleQueue.remove(), is("Jack"));
    }

    @Test
    public void whenGetItemByIndex() {
        Object[] objects = new Object[16];
        SimpleQueue<String> simpleQueue = new SimpleQueue<>(objects);
        String a = "Hi";
        String b = "Jack";
        simpleQueue.push(a);
        simpleQueue.push(b);
        assertThat(simpleQueue.get(1), is("Jack"));
        assertThat(simpleQueue.get(0), is("Hi"));
    }
}
