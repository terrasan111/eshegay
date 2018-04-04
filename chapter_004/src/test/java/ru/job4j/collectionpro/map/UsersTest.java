package ru.job4j.collectionpro.map;


import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 04.04.2018.
 */
public class UsersTest {

    @Test
    public void whenEqualsAndHashCodeOriginal() {

        Map<User, Object> map = new HashMap<>();
        Calendar birthday = new GregorianCalendar(98, 10, 12);
        User user = new User("Tom", 20, birthday);
        User user2 = new User("Tom", 20, birthday);
        map.put(user, "Russia");
        map.put(user2, "Russia");
        System.out.println(map);
    }


}