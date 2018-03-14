package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public class UserStore extends AbstractStore implements Store {

  private   SimpleArray<User> user = new SimpleArray<>(100);

    public UserStore(SimpleArray<User> user) {
        this.user = user;
    }


}
