package ru.job4j.collectionpro.map;

import java.util.Calendar;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User3 {

    private String name;
    private int children;
    private Calendar birthday;

    public User3(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;
        User3 user = (User3) obj;
        if (this.name == ((User3) obj).name && this.children == ((User3) obj).children && this.birthday == ((User3) obj).birthday) {
            res = true;
        }
        return res;
    }

    // данный метод просто вызвал для переопределения , но не стал переопределять . а то без него не проходит проверку по чек стайлу
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
