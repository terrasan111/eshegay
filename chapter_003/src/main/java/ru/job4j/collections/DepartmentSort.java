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

    public static void main(String[] args) {
        String[] strings =  {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2\\SK1", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        Set<String> test = new TreeSet<>();
        DepartmentSort departmentSort = new DepartmentSort();
        System.out.println(departmentSort.addToTreeSet(strings, test));
        System.out.println(departmentSort.reverseTreeSet(departmentSort.addToTreeSet(strings, test)));
    }

}
