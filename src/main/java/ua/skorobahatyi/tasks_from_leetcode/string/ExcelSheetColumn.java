package ua.skorobahatyi.tasks_from_leetcode.string;


/**
 * 168. Excel Sheet Column Title
 * https://leetcode.com/problems/excel-sheet-column-title/
 * <p>
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * Example 1:
 * <p>
 * Input: columnNumber = 1
 * Output: "A"
 * Example 2:
 * <p>
 * Input: columnNumber = 28
 * Output: "AB"
 * Example 3:
 * <p>
 * Input: columnNumber = 701
 * Output: "ZY"
 */
public class ExcelSheetColumn {
    public static void main(String[] args) {

        System.out.println(convertToTitle(27));
//        System.out.println(convertToTitle(2));
//        System.out.println(convertToTitle(25));
        System.out.println(convertToTitle(52));
        System.out.println(convertToTitle(26));

        System.out.println(convertToTitle(701));
    }

    private static String convertToTitle(int columnNumber) {

        int mod = 0;
        String str = "";

        while (columnNumber > 0) {
            mod = columnNumber % 26;
            if (mod > 0) {
                columnNumber = columnNumber - mod;
                str += Character.toString(mod + 64);
            } else {
                columnNumber = columnNumber - 26;
                str += Character.toString(90);
            }
            columnNumber = columnNumber / 26;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
