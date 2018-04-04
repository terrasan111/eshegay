package ru.job4j.collectionpro.map;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User3Test {

    @Test
    public void whenOverRideEquals() {

        Map<User3, String> map = new HashMap<>();
        Calendar birthday = new GregorianCalendar(98, 10, 12);
        User3 user3 = new User3("Tom", 20, birthday);
        User3 user4 = new User3("Tom", 20, birthday);
        map.put(user3, "Russia");
        map.put(user4, "Russia");
        System.out.println(map);
    }

}