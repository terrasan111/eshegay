package ru.job4j.collectionpro;

import java.util.Iterator;


public class IteratorforArray  implements Iterator<Integer>  {

    private int[][] array;
    private int x = 0;
    private int y = 0;


    public IteratorforArray(int[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext()  {
        return helpForHasNext(array);
    }

    @Override
    public Integer next() {
        int result = 0;
        for (int i = x; i < array.length;) {
            for (int j = y; j < array[i].length;) {
                result = array[i][j];
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
        return result;
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







