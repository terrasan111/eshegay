package ru.job4j.collectionpro;



import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private int[] array;
    private int x = 0;
    private int temp = 0;
    public EvenIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {

       return isPrime(array);
    }

    @Override
    public Integer next()  {
         if (x > array.length) {
             throw new NoSuchElementException();
         }
         for (int i = x; i < array.length;) {
             temp = array[i];
             break;
         }
         x++;
        return (temp % 2 == 0) ? temp : next();
    }

    public boolean  isPrime(int[] array) {
        boolean rsl = false;
        for (int i = x; i < array.length;) {
            temp = array[i];
            if (temp % 2 == 0) {
                rsl  = true;
            }
            if (x == array.length - 1 && !rsl) {
                return false;
            }
            if (!rsl) {
                x++;
            }

            break;
        }

        return (rsl) ? rsl : isPrime(array);
    }

}
