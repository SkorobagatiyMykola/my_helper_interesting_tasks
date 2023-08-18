package ua.skorobahatyi.tasks_from_leetcode.numbers;


import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        //  System.out.println(generate(10));
        System.out.println(getRow(3));

    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> arrNew;
        List<Integer> arrModify;
        for (int iteration = 1; iteration <= numRows; iteration++) {
            if (iteration == 1) {
                arrNew = new ArrayList<>();
                arrNew.add(1);
                result.add(arrNew);
            } else if (iteration == 2) {
                arrNew = new ArrayList<>();
                arrNew.add(1);
                arrNew.add(1);
                result.add(arrNew);
            } else {
                arrModify = new ArrayList<>(result.get(result.size() - 1));
                arrNew = new ArrayList<>();
                for (int i = 0; i < arrModify.size() - 1; i++) {
                    arrNew.add(arrModify.get(i) + arrModify.get(i + 1));
                }
                arrNew.add(0, 1);
                arrNew.add(1);

                result.add(arrNew);
            }
        }

        return result;
    }

    private static List<Integer> getRow(int numRows) {

        List<Integer> arrNew = null;
        List<Integer> arrModify;
        for (int iteration = 0; iteration <= numRows; iteration++) {
            if (iteration == 0) {
                arrNew = new ArrayList<>();
                arrNew.add(1);
                if (iteration == numRows)
                    return arrNew;
            } else if (iteration == 1) {
                arrNew = new ArrayList<>();
                arrNew.add(1);
                arrNew.add(1);
                if (iteration == numRows)
                    return arrNew;
            } else {
                arrModify = new ArrayList<>(arrNew);
                arrNew = new ArrayList<>();
                for (int i = 0; i < arrModify.size() - 1; i++) {
                    arrNew.add(arrModify.get(i) + arrModify.get(i + 1));
                }
                arrNew.add(0, 1);
                arrNew.add(1);

                if (iteration == numRows)
                    return arrNew;
            }
        }
        return null;

    }


}
