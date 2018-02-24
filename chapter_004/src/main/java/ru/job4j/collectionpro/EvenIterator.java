package ru.job4j.collectionpro;

import org.omg.CORBA.Object;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
    private int x = 0;
    private int z = 0;

    @Override
    public boolean hasNext() {
        return outputHasNext(array);
    }


    @Override
    public  Integer next() {
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
                if (z % 2 != 0) {
                    outputHasNext(array);
                }
                break;
            }
            if (array[i] % 2 == 1) {
                    x = ++i;
                if (i == 7) {
                   return false;
                }
            }
        }
        return tmp;
    }

}
