package ua.skorobahatyi.tasks_from_leetcode.string;

/**
 * Very popular task for string
 * */
public class Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("()]"));

    }

    private static boolean isValid(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
            s = s.replace("{}", "")
                    .replace("[]", "")
                    .replace("()", "");
        }
        return s.length() == 0 ? true : false;
    }
}
