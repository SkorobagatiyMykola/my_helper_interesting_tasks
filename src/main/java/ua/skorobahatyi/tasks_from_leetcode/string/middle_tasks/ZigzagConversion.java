package ua.skorobahatyi.tasks_from_leetcode.string.middle_tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Zigzag Conversion
 * https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 * <p>
 * Input: s = "A", numRows = 1
 * Output: "A"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
public class ZigzagConversion {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));

        String my1="PAHNAPLSIIGYIR";
        String your1="PAHNAPLSIIGYIR";
        System.out.println(my1.equals(your1));

        String my2="PINALSIGYAHRPI";
        String your2="PINALSIGYAHRPI";
        System.out.println(my2.equals(your2));

    }

    private static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;


        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<String> list = new ArrayList<>();
            //list.to
            //Ints
            result.add(list);
        }

        int n = 2 * numRows - 2;

        for (int i = 0; i < s.length(); i++) {
            int idBig = i % n;
            if (idBig == 0) {
                result.get(0).add(String.valueOf(s.charAt(i)));
            } else if (idBig < numRows) {
                result.get(idBig).add(String.valueOf(s.charAt(i)));
            } else {
                result.get(n - idBig).add(String.valueOf(s.charAt(i)));
            }
        }


        String str = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                str += result.get(i).get(j);
            }
        }

        return str;
    }
}
