package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator2 implements Iterator<Integer> {

    private int[] array;
    private int x = 0;
    private int temp = 0;

    public EvenIterator2(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return isPrime(array) ? true : isPrime(array);
    }

    @Override
    public Integer next() {
        if (x == array.length) {
            throw new NoSuchElementException();
        }
        for (int i = x; i < array.length;) {
            temp = array[i];
            break;
        }

        x++;
        if (temp == 2) {
            return temp;
        }
        return ((temp > 2) && (temp % temp == 0) && (temp % 1 == 0) && (temp % 2 == 1)) ? temp : next();
    }

    public boolean  isPrime(int[] array) {
        boolean rsl = false;
        for (int i = x; i < array.length;) {
            temp = array[i];
            if (temp == 2) {
                rsl = true;
            }
            if (temp > 1 && temp % 2 == 1) {
                rsl  = true;

            }
           if (!rsl) {
                x++;
           }
            break;
        }
        return rsl;
    }
}
