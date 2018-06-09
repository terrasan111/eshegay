package ru.job4j.collectionpro.set;

import ru.job4j.collectionpro.list.MyLinkedList;


import java.util.Iterator;

/**
 * Created by Evgeniy on 31.03.2018.
 */
public class SimpleSet2<E>  extends MyLinkedList<E> {


    private boolean tmp = true;

    @Override
    public boolean add(Object value) {
        boolean res = false;
         if (size == 0 || !tmp) {
             Node prev = first;
             prev.item =  value;
             first = new MyLinkedList.Node(null, null, prev);
             prev.prev = first;
             size++;
             res = true;
             return res;
         }

         while (iterator().hasNext()) {
             E temp = (E) iterator().next();
              tmp = value.equals(temp);
            if (tmp) {
                break;
            }
         }

         count = 0;

        if (!tmp) {
            add(value);
            res = true;
        }
        return res;
    }
}
