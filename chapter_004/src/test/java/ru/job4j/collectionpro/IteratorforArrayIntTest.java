package ru.job4j.collectionpro;


import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class IteratorforArrayIntTest {

      @Test
      public void hasNextNextSequentialInvocation() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1, 2, 3}, {4, 5, 6}});
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(1));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(2));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(3));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(4));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(5));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(6));
            assertThat(it.hasNext(), is(false));
      }

      @Test
      public void testsThatNextMethodDoesntDependsOnPriorHasNextInvocation() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1, 2, 3}, {4, 5, 6}});
            assertThat(it.next(), is(1));
            assertThat(it.next(), is(2));
            assertThat(it.next(), is(3));
            assertThat(it.next(), is(4));
            assertThat(it.next(), is(5));
            assertThat(it.next(), is(6));
      }

      @Test
      public void sequentialHasNextInvocationDoesntAffectRetrievalOrder() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1, 2, 3}, {4, 5, 6}});
            assertThat(it.hasNext(), is(true));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(1));
            assertThat(it.next(), is(2));
            assertThat(it.next(), is(3));
            assertThat(it.next(), is(4));
            assertThat(it.next(), is(5));
            assertThat(it.next(), is(6));
      }

      @Test(expected =  NoSuchElementException.class )
      public void shoulThrowNoSuchElementException() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{});
            it.next();
      }


      @Test
      public void hasNextNextSequentialInvocation2() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1}, {3, 4}, {7}});
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(1));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(3));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(4));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(7));
            assertThat(it.hasNext(), is(false));
      }

      @Test
      public void testsThatNextMethodDoesntDependsOnPriorHasNextInvocation2() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1}, {3, 4}, {7}});
            assertThat(it.next(), is(1));
            assertThat(it.next(), is(3));
            assertThat(it.next(), is(4));
            assertThat(it.next(), is(7));
      }

      @Test
      public void sequentialHasNextInvocationDoesntAffectRetrievalOrder2() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1}, {3, 4}, {7}});
            assertThat(it.hasNext(), is(true));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(1));
            assertThat(it.next(), is(3));
            assertThat(it.next(), is(4));
            assertThat(it.next(), is(7));
      }

      @Test
      public void hasNextNextSequentialInvocation3() {
            IteratorforArrayInt it = new IteratorforArrayInt(new int[][]{{1}, {3, 4}, {7}});
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(1));
            assertThat(it.hasNext(), is(true));
            assertThat(it.next(), is(3));

      }




}