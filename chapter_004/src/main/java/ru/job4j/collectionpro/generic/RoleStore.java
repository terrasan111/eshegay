package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public class RoleStore  extends  AbstractStore  {

    SimpleArray<Role> roles = new SimpleArray<>(100);

    public RoleStore(SimpleArray<Role> roles) {
        this.roles = roles;

    }


}
