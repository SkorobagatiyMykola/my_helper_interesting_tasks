package ua.skorobahatyi.helper_for_tests.it_quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * What is the output of the following code?
 *
 * [bar, baz] [bar, baz] [bar, baz]
 * [bar] [foo, baz]
 * [bar] [bar] [foo, baz]   (todo !!!)
 * Nothing. A RuntimeException will be thrown.
 *
 * */
public class Task2 {
    public static void main(String[] args) {
        List<String> listl = new ArrayList<>();
        listl.add("foo");

        List<String> list2 = listl;
        List<String> list3 = new ArrayList<>(list2);
        listl.clear();
        list2.add("bar");
        list3.add("baz");
        System.out.println(listl);
        System.out.println(list2);
        System.out.println(list3);

    }
}
