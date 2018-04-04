package ru.job4j.collectionpro.map;

import java.util.Calendar;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User2 {

    private String name;
    private int children;
    private Calendar birthday;

    public User2(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }


    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + birthday.hashCode();
        return hash;
    }
}
