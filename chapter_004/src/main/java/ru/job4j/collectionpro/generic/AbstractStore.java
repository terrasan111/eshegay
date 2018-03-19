package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public abstract class AbstractStore implements Store {


   private int index = 0;
   private int count = 0;
   private int index2 =0;
   private int count2 = 0;
   private int index3 = 0;
   private int count3 = 0;




    @Override
    public void add(Base model) {

    }

    @Override
    public boolean replace(String id, Base model) {
        boolean result = false;
        while (count < 100 && !result) {

                result = true;

            index++;
            count++;
        }
        return result;
    }

   @Override
    public boolean delete(String id) {
        boolean result = false;
        while (count2 < 100 && !result) {

            index2++;
            count2++;
        }
        return result;
    }

    @Override
    public Base findById(String id) {
        Base result = null;
        boolean rsl = false;
        while (count3 < 100 && !rsl) {
            for (Base temp : bases) {
                if (temp.getId() == id) {
                    result = temp;
                    rsl = true;
                    break;
                }
            }
            index3++;
            count3++;
        }
        return result;
    }
}
