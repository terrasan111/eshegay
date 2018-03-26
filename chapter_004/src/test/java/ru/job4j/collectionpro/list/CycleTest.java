package ru.job4j.collectionpro.list;

/**
 * Created by Evgeniy on 25.03.2018.
 */

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CycleTest {

    @Test
    public void whenListHasNoCycle() {

       Cycle<Integer> cycle = new Cycle();
         Integer one = 1;
         Integer  two = 2;
         Integer three = 3;
         cycle.add(one);
         cycle.add(two);
         cycle.add(three);
         assertThat(cycle.hasCycle(cycle.getFirst()), is(false));
    }



    @Test
    public void whenHaveCycle() {

        Node first = new Node(1);
        Node two = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        first.setNext(two);
        two.setNext(third);
        third.setNext(two);
        four.setNext(first);
        Node node = new Node(1);
        assertThat(node.hasCycle(first), is(true));

    }


}
