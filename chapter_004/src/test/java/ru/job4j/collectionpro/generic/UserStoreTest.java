package ru.job4j.collectionpro.generic;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Evgeniy on 21.03.2018.
 */
public class UserStoreTest {

    @Test
    public void whenReplaceItem() {

        UserStore userStore = new UserStore();
        User one = new User("Jack");
        User two = new User("Tom");
        userStore.add(one);
        assertThat(userStore.replace("Jack", two), is(true));
    }

    @Test
    public void whenDeleteItem() {
        UserStore userStore = new UserStore();
        User one = new User("Jack");
        userStore.add(one);
        assertThat(userStore.delete("Jack"), is(true));
    }

    @Test
    public void whenFindItem() {
        UserStore userStore = new UserStore();
        User one = new User("Jack");
        userStore.add(one);
        User result = userStore.findById("Jack");
        assertThat(result, is(one));
    }
}
