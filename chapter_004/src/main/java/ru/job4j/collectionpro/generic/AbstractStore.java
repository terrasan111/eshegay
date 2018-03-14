package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public abstract class AbstractStore<T> {

    private Base[] bases;
    int index = 0;

    public void add(Base model) {
        bases[index] = model;
        index++;
    }


    public boolean replace(String id, Base model) {
        boolean result = false;
       for (int i = 0 ; i < bases.length; i++) {
           if (bases[i].getId() == id) {
               bases[i] = model;
               result = true;
               break;
           }
       }
        return result;
    }


    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0 ; i < bases.length; i++) {
            if (bases[i].getId() == id) {
                bases[i] = null;
                result = true;
                break;
            }
        }
        return result;
    }


    public Base findById(String id) {
        Base result = null;
        for (int i = 0 ; i < bases.length; i++) {
            if (bases[i].getId() == id) {
               result =  bases[i] ;
                break;
            }
        }
        return result;
    }
}
