package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForSimpleNumber implements Iterator<Integer> {

    private int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 3571};
    private int j = 0;
    private boolean q = true;

    @Override
    public boolean hasNext() {
        return result();
    }

    @Override
    public Integer next() {
       try {
           return array[j];
       } catch (NoSuchElementException nse) {
           System.out.println(" the element is absent");
        }
        return array[j];
    }

    public boolean outputHasNext(int[] array) {
        boolean temp = false;
        int i = j;

        if (array[i] == 1) {
            j = ++i;
            --i;
        }

        if (array[i] == 2) {
            if (array[++i] % 2 != 0) {
                temp = true;
            }
                j = --i;
            }

        if (array[i] >= 3) {
            j++;
            if (array[ ++i] % 2 != 0 && i < array.length) {
                    int a = array[i];
                    if ((array[i] % a == 0) && (array[i] % 1 == 0)) {
                        temp = true;
                        j = i;
                        if (j == 7) {
                            j--;
                        }
                }
            }
        }
        return temp;
    }


    public boolean result() {
        boolean temp = false;
       if (temp != outputHasNext(array)) {
           temp = true;
           j++;
       } else {
          temp = outputHasNext(array);
       }
        return temp;
    }
}

