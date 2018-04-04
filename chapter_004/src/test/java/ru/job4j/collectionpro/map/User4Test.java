package ru.job4j.collectionpro.map;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class User4Test {

    @Test
    public void whenOverrideEqualsAndHashCode() {

        Map<User4, String> map = new HashMap<>();
        Calendar birthday = new GregorianCalendar(98, 10, 12);
        User4 user1 = new User4("Tom", 20, birthday);
        User4 user2 = new User4("Tom", 20, birthday);
        map.put(user1, "Russia");
        map.put(user2, "Moscow");
        System.out.println(map);

    }
}