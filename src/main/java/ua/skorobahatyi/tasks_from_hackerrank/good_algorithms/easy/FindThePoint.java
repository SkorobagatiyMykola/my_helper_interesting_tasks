package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class FindThePoint {

    public static void main(String[] args) {
        System.out.println(findPoint(0,0,1,1));
    }

    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
        // Write your code here

        List<Integer> list = new ArrayList<>();
        int rx=2*qx-px;
        int ry=2*qy-py;
        list.add(rx);
        list.add(ry);

        return list;

    }
}
