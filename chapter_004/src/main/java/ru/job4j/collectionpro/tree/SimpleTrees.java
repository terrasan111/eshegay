package ru.job4j.collectionpro.tree;


import java.util.Optional;

/**
 * Created by Evgeniy on 06.04.2018.
 */
public interface SimpleTrees<E extends Comparable<E>> extends Iterable<E> {

    boolean add(Node parent, Node child);

    Optional<Node<E>> findBy(E value);

}
