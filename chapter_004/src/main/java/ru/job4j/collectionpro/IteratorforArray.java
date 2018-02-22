package ru.job4j.collectionpro;

import java.util.Iterator;

public class IteratorforArray  implements Iterator<Integer>  {

   private int[][] array = new int[][] {{1, 2, 3}, {4, 5, 6}};
   private int x;
   private int y;


    @Override
    public boolean hasNext() {
                return arrayLength(array);
            }


    @Override
    public Integer next() {
        return itemArray(array);
    }


    public boolean arrayLength(int[][] array) {
        boolean a = false;
        int i = x;
        int j = y;
        for ( ; i < array.length; i++) {
            for (  ; j < array[i].length; j++) {
                break;
            }
          break;
        }
        while (i < array.length && j < array[i].length) {
            a = true;
            break;
        }
        return a;
    }


    public int itemArray(int[][] array) {
        int a = 0;

            for (int i = x; i < array.length;) {
                for (int j = y; j < array[i].length;) {
                    a = array[i][j];

                    y = j + 1;
                    break;
                }
                if (y == array[i].length) {
                    x = i + 1;
                    y = 0;
                break;
                }
              break;
            }
        return  a;
    }

}







