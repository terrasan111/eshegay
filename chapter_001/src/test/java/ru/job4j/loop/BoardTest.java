package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Board;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        String except = "X X" + ln + " X " + ln + "X X" + ln;  // добавил сепаратор
        assertThat(rsl, is(except));


    }

    @Test
    public void when5x4() {
        Board board = new Board();
        String rsl = board.paint(5, 4);
        String ln = System.lineSeparator();
        String except = "X X X" + ln + " X X " + ln + "X X X" + ln + " X X " + ln;  // добавил сепаратор
        assertThat(rsl, is(except));


    }
}
