package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator2 implements Iterator<Integer> {

    private int[] array = new int[] {2, 4, 6, 8};
    private int x = 0;
    private int z = 0;

    @Override
    public boolean hasNext() {
        return outputHasNext(array);
    }


    @Override
    public  Integer next()   {
        try {
            return z;
        } catch (NoSuchElementException nse) {
            System.out.println("the element is absent");
        }
        return z;
    }

    public boolean outputHasNext(int[] array) {
        boolean tmp = false;
        int i = x;
        for (; i < array.length;) {
            if (array[i] % 2 == 0) {
                tmp = true;
                z = array[i];
                x = ++i;
                break;
            }
            if (array[i] % 2 == 1) {
                x = ++i;
            }
        }
        return tmp;
    }

}
