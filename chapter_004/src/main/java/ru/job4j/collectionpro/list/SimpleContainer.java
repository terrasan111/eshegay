package ru.job4j.collectionpro.list;

/**
 * Created by Evgeniy on 24.03.2018.
 */
public interface SimpleContainer<E> extends Iterable<E> {

    boolean add(E value);

    E get(int index);

}
