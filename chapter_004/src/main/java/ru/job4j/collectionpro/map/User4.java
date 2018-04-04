package ru.job4j.collectionpro.map;

import java.util.Calendar;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User4 {

    private String name;
    private int children;
    private Calendar birthday;

    public User4(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User4 user4 = (User4) o;

        if (children != user4.children) {
            return false;
        }
        if (name != null ? !name.equals(user4.name) : user4.name != null) {
            return false;
        }

        return birthday != null ? birthday.equals(user4.birthday) : user4.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + children;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}
