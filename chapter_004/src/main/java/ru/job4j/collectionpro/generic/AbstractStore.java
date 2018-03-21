package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {

   private int count = 0;
   private int count2 = 0;
   private SimpleArray<T> simpleArray = new SimpleArray<T>(100);


    @Override
    public void add(T model) {
     simpleArray.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        boolean result = false;
       for (T temp : simpleArray) {
           if (temp.getId() == id) {
               simpleArray.set(count, model);
               result = true;
               break;
           }
           count++;
       }
        return result;
    }

   @Override
    public boolean delete(String id) {
        boolean result = false;
       for (T temp : simpleArray) {
           if (temp.getId() == id) {
               simpleArray.delete(count2);
               result = true;
               break;
           }
           count2++;
       }
        return result;
    }

    @Override
    public T findById(String id) {
        T result = null;
        boolean rsl = false;
            for (T temp : simpleArray) {
                if (temp.getId() == id) {
                    result = temp;
                    rsl = true;
                    break;
                }
            }
        return result;
    }
}
