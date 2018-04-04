package ru.job4j.collectionpro.map;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User2Test {

    @Test
    public void whenOverRideHashCode() {
        Map<User2, String> map2 = new HashMap<>();
        Calendar birthday = new GregorianCalendar(98, 10, 12);
        User2 user2 = new User2("Tom", 20, birthday);
        User2 user3 = new User2("Tom", 20, birthday);
        map2.put(user2, "Russia");
        map2.put(user3, "Russia");
        System.out.println(map2);
    }

}