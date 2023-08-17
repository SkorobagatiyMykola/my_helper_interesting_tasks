package ua.skorobahatyi.tasks_from_leetcode.numbers;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println("==============  Roman To Integer  =++=====================");
        System.out.println("IV" + " - " + romanToInt("IV"));
        System.out.println("MCMXCIV" + " - " + romanToInt("MCMXCIV"));

        System.out.println("============    Integer to Roman   ========================");
        System.out.println(4 + " - " + intToRoman(4));
        System.out.println(9 + " - " + intToRoman(9));
        System.out.println(13 + " - " + intToRoman(13));
        System.out.println(100 + " - " + intToRoman(100));
        System.out.println(199 + " - " + intToRoman(199));
        System.out.println(1994 + " - " + intToRoman(1994));

    }

    private static int romanToInt(String s) {
        int number = 0;
        while (s.contains("IV") || s.contains("IX") ||
                s.contains("XL") || s.contains("XC") ||
                s.contains("CD") || s.contains("CM")) {
            if (s.contains("IV")) {
                s = s.replace("IV", "");
                number += 4;
            } else if (s.contains("IX")) {
                s = s.replace("IX", "");
                number += 9;
            } else if (s.contains("XL")) {
                s = s.replace("XL", "");
                number += 40;
            } else if (s.contains("XC")) {
                s = s.replace("XC", "");
                number += 90;
            } else if (s.contains("CD")) {
                s = s.replace("CD", "");
                number += 400;
            } else if (s.contains("CM")) {
                s = s.replace("CM", "");
                number += 900;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                number += 1;
            } else if (s.charAt(i) == 'V') {
                number += 5;
            } else if (s.charAt(i) == 'V') {
                number += 5;
            } else if (s.charAt(i) == 'X') {
                number += 10;
            } else if (s.charAt(i) == 'L') {
                number += 50;
            } else if (s.charAt(i) == 'C') {
                number += 100;
            } else if (s.charAt(i) == 'D') {
                number += 500;
            } else if (s.charAt(i) == 'M') {
                number += 1000;
            }

        }

        return number;
    }

    private static String intToRoman(int number) {
        String result = "";
        int mCount = number / 1000;
        result += countSymbols("M", mCount);
        number -= mCount * 1000;

        int dCount = number / 500;
        number -= dCount == 1 ? 500 : 0;
        int dcCount = number / 100;
        if (dcCount == 4) {
            result += dCount == 1 ? "CM" : "CD";
        } else {
            result += dCount == 1 ? "D" : "";
            result += countSymbols("C", dcCount);
        }
        number -= 100 * dcCount;

        int lCount = number / 50;
        number -= lCount == 1 ? 50 : 0;
        int lxCount = number / 10;
        if (lxCount == 4) {
            result += lCount == 1 ? "XC" : "XL";
        } else {
            result += lCount == 1 ? "L" : "";
            result += countSymbols("X", lxCount);
        }
        number -= 10 * lxCount;

        int vCount = number / 5;
        number -= vCount == 1 ? 5 : 0;
        int viCount = number;
        if (viCount == 4) {
            result += vCount == 1 ? "IX" : "IV";
        } else {
            result += vCount == 1 ? "V" : "";
            result += countSymbols("I", viCount);
        }
        number -= viCount;

        return result;
    }

    private static String countSymbols(String symbol, int times) {
        String res = "";
        for (int i = 0; i < times; i++) {
            res += symbol;
        }
        return res;
    }
}
