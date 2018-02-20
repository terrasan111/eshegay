package ru.job4j.collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class DepartmentSortTest {

    @Test
    public void testforAddToTreeSet() {
        String[] strings =  {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2\\SK1", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        Set<String> test = new TreeSet<>();
        DepartmentSort departmentSort = new DepartmentSort();
        test = departmentSort.addToTreeSet(strings, test);
        Set<String> result = new TreeSet<>();
        result.add("K1\\SK1");
        result.add("K1\\SK1\\SSK1");
        result.add("K1\\SK1\\SSK2");
        result.add("K1\\SK2");
        result.add("K2\\SK1");
        result.add("K2\\SK1\\SSK1");
        result.add("K2\\SK1\\SSK2");
        assertThat(test, is(result));
    }


    @Test
    public void reverseTest() {
        String[] strings =  {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2\\SK1", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        Set<String> test = new TreeSet<>();
        DepartmentSort departmentSort = new DepartmentSort();
        test = departmentSort.addToTreeSet(strings, test);
        List<String> result = new ArrayList<>();
        result = departmentSort.reverseTreeSet(test);
        List<String> expect = new ArrayList<>();
        expect.add("K2\\SK1\\SSK2");
        expect.add("K2\\SK1\\SSK1");
        expect.add("K2\\SK1");
        expect.add("K1\\SK2");
        expect.add("K1\\SK1\\SSK2");
        expect.add("K1\\SK1\\SSK1");
        expect.add("K1\\SK1");
        assertThat(result, is(expect));
    }

}