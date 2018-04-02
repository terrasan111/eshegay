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
            Iterator<Integer> current = it.next();


            @Override
            public boolean hasNext() {
               if (!current.hasNext()) {
                   return false;
               }
                boolean temp = false;
                if (current.hasNext()) {
                    temp = true;

                } else {
                    current = it.next();
                    hasNext();
                }

                return temp;
            }

            @Override
            public Integer next()  {

                if (current.hasNext()) {
                    temp2 = current.next();
                } else {
                    current = it.next();
                    next();
                }

                if (!current.hasNext()) {
                    throw new NoSuchElementException();
                }

                return temp2;
            }
        };
    }
}
