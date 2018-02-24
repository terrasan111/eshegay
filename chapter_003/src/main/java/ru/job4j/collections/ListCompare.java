package ru.job4j.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator<List<Integer>>  {

    @Override
    public int compare(List<Integer> left, List<Integer> right) {
        int result = 0;
        int summa = 0;
        int i = 0;
        int count = 0;
        if (left.size() == right.size()) {
            for (int a = 0; a < left.size(); a++) {
                i = left.get(a);
                    result = Integer.compare(i, simpleLoop(right, count));
                    count++;
                    summa += result;
                }
            }
         if (left.size() < right.size()) {
           result = Integer.compare(i, simpleLoop(right, count));
           summa += result;
         }
        return summa;
    }

    public int simpleLoop(List<Integer> right, int count) {
        int j = 0;
        while (count < right.size()) {
            j = right.get(count);
            break;
        }
        return j;
    }
}
