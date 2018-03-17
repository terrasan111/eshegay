package ru.job4j.collectionpro;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorIterator implements Iterator<Integer> {

    private int count = 0;
    private int temp2 = 0;
    private int temp3 = 0;


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        Iterator<Iterator<Integer>> main = it;
        Iterator<Integer> iter = main.next();
        Iterator<Integer> it2  = main.next();
        Iterator<Integer> it3 = main.next();

        return new Iterator<Integer>() {


            @Override
            public boolean hasNext() {

                boolean temp = false;
                    if (iter.hasNext()) {
                        temp = true;
                    } else {

                        if (it2.hasNext()) {
                            temp = true;
                        }
                        if (!it2.hasNext()) {
                            count = 1;
                        }
                    }


                if (count == 1) {
                        if (it3.hasNext()) {
                            temp = true;
                        }
                }

                return temp;
            }

            @Override
            public Integer next()  {

                if (temp3 == 1) {
                    if (it3.hasNext()) {
                        temp2 = it3.next();
                    }

                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }

                if (iter.hasNext()) {
                        temp2 = iter.next();
                    } else {
                    if (it2.hasNext()) {
                        temp2 = it2.next();
                        if (!it2.hasNext()) {
                            temp3 = 1;
                        }
                    }
                }

                return temp2;
            }
        };
    }
}
