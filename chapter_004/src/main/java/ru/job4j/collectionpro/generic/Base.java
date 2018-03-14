package ru.job4j.collectionpro.generic;

/**
 * Created by Evgeniy on 12.03.2018.
 */
public  abstract class Base {

    private final String id;

    protected Base(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
