package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {

        int[] massive = new int[] {1, 2, 3, 4, 5};
        Turn t = new Turn();
        t.back(massive);

    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {


        int[] massive = new int[] {4, 1, 6, 2};
        Turn t = new Turn();
        t.back(massive);
    }
}
