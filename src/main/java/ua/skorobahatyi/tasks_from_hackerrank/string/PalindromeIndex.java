package ua.skorobahatyi.tasks_from_hackerrank.string;

public class PalindromeIndex {

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaab"));
        System.out.println(palindromeIndex("bcbc"));
        System.out.println(palindromeIndex("bcbcsq"));
        System.out.println(palindromeIndex("bbbbb"));
    }

    public static int palindromeIndex(String s) {
        if (isPalindrome(s))
            return -1;

        // Write your code here
        for (int i = 0; i < s.length(); i++) {
            String str="";
            if (i==0)
                str=s.substring(1);
            else if (i==s.length()-1)
                str=s.substring(0,s.length()-1);
            else
                str=s.substring(0,i-1)+s.substring(i+1);

            if (isPalindrome(str))
                return i;
        }
        return -1;
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.length() == 0)
            return true;

        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;
    }
}
