package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorforArray  implements Iterator<Integer>  {

    private int[][] array;
    private int x = 0;
    private  int y = 0;
    private int i = x;
    private int j = y;

    public IteratorforArray(int[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext()  {
        int b = 0;
        boolean tmp = false;
        for (; x < array.length;) {
            for (; y < array[i].length;) {
                b = array[x][y];
                tmp = true;
                break;
            }
            break;
        }

        return tmp;
    }

    @Override
    public Integer next() {
        int d = 0;
        for (int i = x; i < array.length;) {
            for (int j = y; j < array[i].length;) {
                d = array[i][j];
                if (y + 1 == array[i].length) {
                    x += 1;
                    y = -1;
                }
                y += 1;
                break;
            }
            break;
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return d;
    }




}







