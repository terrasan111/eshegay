package ru.job4j.collectionpro.List;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created by Evgeniy on 15.03.2018.
 */
public class List<E> implements Iterable<E> {


    Object[] objects;
    int index = 0;
    private E e;
    private int modCount = 0;
    private int expectedModCount = 0;

    public List (int size) {
        this.objects[size] =  size;

    }


    public void add(E value) {
       objects[index] = value;
       index++;
       modCount++;
    }

    public E get(int index) {
      return e = (E) objects[index];
    }


    // тут я делаю проверку и если идекс = длинне массива т.е массив заполнен , то я создаю новый массив и увеличиваю его размер по стандартной формуле далее копирую
    // данный в новый массив и указываю программе , что теперь надо испольовать массив увеличенный
    public boolean ensureCapacity(Object [] array) {
        boolean result = false;
        if ( index == array.length ) {
            Object[] array2 = new Object[] {  ((array.length * 3) / 2 ) + 1 };
          System.arraycopy(array,0,array2,0,array2.length);
          objects = array2;
          result = true;
        }
        return result;
    }

     // создал два счетчика . метод add я рассматриваю как метод , который модифицирует массив не методами итератора и если счетчики не совпадают ,
     // то выкидывается исключение . в данном классе изменить коллекцию может только метод add . при его использовании счетчик будет увеличиваться на +1

    @Override
    public Iterator<E> iterator() {
       // expectedModCount = modCount;
        if (expectedModCount != modCount) {
            throw new ConcurrentModificationException();
        }
        return null;
    }
}
