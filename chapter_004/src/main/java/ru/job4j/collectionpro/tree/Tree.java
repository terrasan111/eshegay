
package ru.job4j.collectionpro.tree;
import java.util.*;


public class Tree<E extends Comparable<E>>  implements SimpleTrees<E> {

    private Node<E> root;
    private  Queue<Node<E>> iterator = new LinkedList<>();
    private Node<E> result;
    private  int count = 0;
    private int size = 0;

    public Tree() {
        this.root = null;
    }

    @Override
    public boolean add(Node parent, Node child) {
        boolean result = false;
        int count = 0;

        boolean t = false;
        if (root == null) {
            root = parent;
            root.add(child);
            size++;
            result = true;
        } else if (root == parent) {
            for (Node<E> temp : root.leaves()) {
                try {
                    t = temp.eqValue((E) child.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (t) {
                   count++;
                }
            }
            if (count == 0) {
                root.add(child);
                size++;
                result = true;
            }
        } else {
            result = helpForAdd(parent, child);
        }
        return result;
    }

    private boolean helpForAdd(Node parent, Node child) {
        boolean result = false;
        boolean a = false;
        int count2 = 0;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(this.root);

        while (!queue.isEmpty()) {
            Node<E> el = queue.poll();
             a = el.eqValue((E) parent.getValue());
            if (a) {
              if (el.size() == 0) {
                  el.add(child);
                  size++;
                  result = true;
                  break;
              } else {
                  for (Node<E> tmp : el.leaves()) {
                      boolean b = tmp.eqValue((E) child);
                      if (b) {
                          count2++;
                      }
                  }
                  if (count2 == 0) {
                      el.add(child);
                      size++;
                      break;
                  }
              }
            }
            for (Node<E> temp : el.leaves()) {
                queue.offer(temp);
            }
        }
        return result;
    }

    public boolean isBinary() {
        boolean res = false;
        int count = 0;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(this.root);

        while (!queue.isEmpty()) {
            Node<E> temp = queue.poll();
            List<Node<E>> list;
            list = temp.leaves();

            if (list.size() <= 2) {
                for (Node<E> temp2 : list) {
                    queue.offer(temp2);
                }
                count++;
            }
        }
        if (size == count) {
            res = true;
        }
        return res;
    }





    @Override
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.leaves()) {
                data.offer(child);
            }
        }
        return rsl;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {


            @Override
            public boolean hasNext() {
                if (count == 0) {
                    iterator.offer(root);
                    count++;
                }
                boolean res = false;
                result = iterator.peek();
                if (result != null) {
                    res = true;
                    for (Node<E> temp : result.leaves()) {
                        iterator.add(temp);
                    }
                }
                return res;
            }

            @Override
            public E next() {
                if (iterator.isEmpty()) {
                    throw new NoSuchElementException();
                }
                result = iterator.poll();
                return result.getValue();
            }
        };
    }
}

