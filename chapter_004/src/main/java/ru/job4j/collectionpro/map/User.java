package ru.job4j.collectionpro.map;

import java.util.Calendar;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User {

    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }
}
