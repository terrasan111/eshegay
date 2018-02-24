package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator3 implements Iterator<Integer> {

    private int[] array = new int[] {2, 2, 4, 6};
    private int x = 0;
    private int z = 0;

    @Override
    public boolean hasNext() {
        return outputHasNext(array);
    }


    @Override
    public  Integer next()  {
        try {
            return outputNext(array, x);
        } catch (NoSuchElementException nse) {
            System.out.println("the element is absent");
        }
        return outputNext(array, x);
    }

    public boolean outputHasNext(int[] array) {
        boolean tmp = false;
        int i = x;
        for (; i < array.length;) {
            if (array[i] % 2 == 0) {
                tmp = true;
                x = ++i;
                break;
            }
            if (array[i] % 2 == 1) {
                x = ++i;
            }
        }
        return tmp;
    }

    public int outputNext(int[] array, int x) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
          a = array[--x];
          boolean temp = outputHasNext(array);
          break;
        }
        return  a;
    }
}
