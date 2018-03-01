package ru.job4j.collectionpro;



import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private int[] array;
    private int x = 0;
    private int y = 0;

    public EvenIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        boolean temp;
        boolean res;
        temp = isPrime(array);
        if (temp) {
            res = temp;
        }
        if (!temp) {
             temp = isPrime(array);
        }

       return temp;
    }

    @Override
    public Integer next() {
         int temp = y;
         if (x  > array.length) {
             throw new NoSuchElementException();
         }
        return temp;
    }

    public boolean  isPrime(int[] array) {
        boolean rsl = false;
        int temp = 0;
        for (int i = x; i < array.length;) {
            temp = array[i];
            if (temp % 2 == 0) {
                rsl  = true;

            }
            y = array[i];
            x++;
            break;
        }
        return rsl;
    }

}
