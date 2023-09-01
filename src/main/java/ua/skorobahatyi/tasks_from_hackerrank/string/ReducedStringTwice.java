package ua.skorobahatyi.tasks_from_hackerrank.string;

public class ReducedStringTwice {
    public static void main(String[] args) {

        System.out.println(superReducedString("aab"));
        System.out.println(superReducedString("aaabccddd"));
        System.out.println(superReducedString("aa"));
        System.out.println(superReducedString("raawabccdzdd"));

    }


    private static String superReducedString(String s) {
        boolean check = true;
        while (check) {
            if (s.length() <= 1)
                check = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    String replcaseStr = new String(String.valueOf("" + s.charAt(i) + s.charAt(i + 1)));
                    s = s.replace(replcaseStr, "");
                    break;
                } else if (i == s.length() - 2) {
                    check = false;
                }
            }
        }

        return s.length() != 0 ? s : "Empty String";

    }
}
