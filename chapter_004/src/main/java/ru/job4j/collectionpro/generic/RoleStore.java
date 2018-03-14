package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public class RoleStore extends AbstractStore implements Store {


  SimpleArray<Role> role = new SimpleArray<Role>(100);

    public RoleStore(SimpleArray<Role> role) {
        this.role = role;
    }
}
