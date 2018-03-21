package ru.job4j.collectionpro.generic;


import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by Evgeniy on 18.03.2018.
 */
public class RoleStoreTest {

    @Test
    public void whenReplaceItem() {

        RoleStore roleStore = new RoleStore();
        Role one = new Role("Jack");
        Role two = new Role("Tom");
        roleStore.add(one);
        assertThat(roleStore.replace("Jack", two), is(true));
    }

    @Test
    public void whenDeleteItem() {
        RoleStore roleStore = new RoleStore();
        Role one = new Role("Jack");
        roleStore.add(one);
        assertThat(roleStore.delete("Jack"), is(true));
    }

    @Test
    public void whenFindItem() {
        RoleStore roleStore = new RoleStore();
        Role one = new Role("Jack");
        roleStore.add(one);
        Role result = roleStore.findById("Jack");
        assertThat(result, is(one));
    }


}