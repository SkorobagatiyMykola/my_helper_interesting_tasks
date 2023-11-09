package ua.skorobahatyi.helper_for_tests.it_quiz;

import java.util.Set;
import java.util.TreeSet;

/**
 *What is the output of the following code?
 *
 * [3, 3, 2, 2, 2, 2]
 * [2, 3]  (!!!!!)
 * [3, 2, 2]
 * [3, 2]
 *
 * */
public class Task14 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(3);
        set.add((int)3.0);
        set.add(2);
        set.add(2);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));

        System.out.println(set);
    }
}
