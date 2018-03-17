package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class IteratorforArrayInt  implements Iterator<Integer>  {

    private int[][] array;
    private int x = 0;
    private int y = 0;
    private int result = 0;

    public IteratorforArrayInt(int[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext()  {
        return helpForHasNext(array);
    }

    @Override
    public Integer next() {
        boolean tmp = false;
        for (int i = x; i < array.length;) {
            for (int j = y; j < array[i].length;) {
                result = array[i][j];
                tmp = true;
                j++;
                y = j;
                if (j == array[i].length) {
                    i++;
                    x = i;
                    y = 0;
                }
                break;
            }

            break;
        }
        if (!tmp ) throw new NoSuchElementException();

        return  result ;
    }

    public boolean helpForHasNext(int[][] array) {
        boolean res = false;
        int tmp = 0;
        for (int i = x; i < array.length;) {
            for (int j = y; j < array[i].length;) {
                 tmp = array[i][j];

                break;
            }

            break;
        }
        if (tmp != 0) {
            res = true;
        }
        return res;
     }
}







