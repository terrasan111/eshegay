package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator2 implements Iterator<Integer> {

    private int[] array;
    private int x = 0;
    private int y = 0;

    public EvenIterator2(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return isPrime(array) ? true : isPrime(array);
    }

    @Override
    public Integer next() {
        if (x == array.length && !hasNext()) {
            throw new NoSuchElementException();
        }
        return y;
    }

    public boolean  isPrime(int[] array) {
        boolean rsl = false;
        int temp = 0;
        for (int i = x; i < array.length;) {
            temp = array[i];
            if (temp == 2) {
                rsl = true;
            }
            if (temp > 1 && temp % 2 == 1) {
                rsl  = true;

            }
            y = array[i];
            x++;
            break;
        }
        return rsl;
    }
}
