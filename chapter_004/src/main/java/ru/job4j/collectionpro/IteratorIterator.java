package ru.job4j.collectionpro;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class IteratorIterator implements Iterator<Integer> {

    private int temp2 = 0;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {


        return new Iterator<Integer>() {
            Iterator<Iterator<Integer>> main = it;
            Iterator<Integer> iter = main.next();
            Iterator<Integer> it2  = main.next();

            @Override
            public boolean hasNext() {
               if (!iter.hasNext()) {
                   return false;
               }
                boolean temp = false;
                if (iter.hasNext()) {
                    temp = true;

                } else {
                    iter = it2;
                    hasNext();
                }

                return temp;
            }

            @Override
            public Integer next()  {

                if (iter.hasNext()) {
                    temp2 = iter.next();
                } else {
                    iter = it2;
                    next();
                }

                if (!iter.hasNext()) {
                    throw new NoSuchElementException();
                }

                return temp2;
            }
        };
    }
}
