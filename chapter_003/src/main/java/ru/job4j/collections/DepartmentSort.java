package ru.job4j.collections;

import java.util.*;


public class DepartmentSort  {


    public Set<String> addToTreeSet(String[] test, Set<String> list) {
        for (int i = 0; i < test.length; i++) {
            list.add(test[i]);
        }
        return list;
    }

    public List<String> reverseTreeSet(Set<String> list) {
        List<String> list2 = new ArrayList<>();
        for (String string : list) {
            list2.add(string);
        }

        Collections.reverse(list2);
        return list2;
    }

}
