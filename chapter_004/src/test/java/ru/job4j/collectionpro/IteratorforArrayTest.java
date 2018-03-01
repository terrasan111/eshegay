package ru.job4j.collectionpro;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class IteratorforArrayTest {


      @Test (expected = NoSuchElementException.class)
    public void iteratorForArray() {
          IteratorforArray it = new IteratorforArray(new int[][] {{1, 2, 3}, {4, 5, 6}});
          it.hasNext();
          int a = it.next();
          it.hasNext();
          int b = it.next();
          it.hasNext();
          int c = it.next();
          it.hasNext();
          int d = it.next();
          it.hasNext();
          int g = it.next();
          it.hasNext();
          int q = it.next();
          int[] result = new int[] {a, b, c, d, g, q};
          int[] expect = new int[] {1, 2, 3, 4, 5, 6};
          assertThat(result, is(expect));
      }

}