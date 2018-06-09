package ru.job4j.collectionpro.list;


import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Evgeniy on 24.03.2018.
 */
public class SimpleStack<E> implements Iterable<E> {

    protected Object[] objects;
    private int index = 0;
    private int modCount = 0;
    private int i = 0;

    public SimpleStack(Object[] objects) {
        this.objects = objects;
    }

    // добавляет элемент в конец стека
    public void push(E value) {
        objects[index] = value;
        index++;
        modCount++;
        if (index == objects.length) {
            Arrays.copyOf(objects, ((objects.length * 3) / 2) + 1);
        }
    }
    // хотя у стека нет такого метода , но у вектора есть такой метод и стек его наследует . Незнаю нужен ли он здесь вообще.
    public E get(int index) {
        E result = null;
        if (index >= 0 && index < objects.length) {
            result = (E) objects[index];
        }
        return result;
    }
    // Данный метод есть у вектора И стек его наследует.
    public E remove(int index) {
        E res = null;
        if (index >= 0 && index < objects.length) {
             res = (E) objects[index];
            objects[index] = null;
        }
        int a = index;
        while (a < objects.length) {
            objects[index] = objects[++index];
            a++;
            if (index == objects.length - 1) {
                objects[index] = null;
                break;
            }
        }
        return res;
    }

    // такого метода нет у стека , но он есть у очереди . Я реализовал логику метода из очереди
    public E poll() {
        E temp  = null;
        for (int j = objects.length - 1; j >= 0; j--) {
            if (objects[j] != null) {
                temp =  (E) objects[j];
                objects[j] = null;
                break;
            }
        }
        return temp;
    }


    @Override
    public Iterator<E> iterator() {
        final int expectedModCount = modCount;
        if (expectedModCount != modCount) {
            throw new ConcurrentModificationException();
        }
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                boolean temp = false;
                if (objects[i] != null) {
                    temp = true;
                }
                return temp;
            }

            @Override
            public E next() {
                if (objects[i] == null) {
                    throw new NoSuchElementException();
                }
                return (E) objects[i++];
            }
        };
    }
}


