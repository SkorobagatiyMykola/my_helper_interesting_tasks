package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * James found a love letter that his friend Harry has written to his girlfriend. James is a prankster,
 * so he decides to meddle with the letter. He changes all the words in the letter into palindromes.
 * <p>
 * https://www.hackerrank.com/challenges/the-love-letter-mystery/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class LoveLetterMystery {

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("cde"));
        System.out.println(theLoveLetterMystery("abc"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("cba"));
        System.out.println(theLoveLetterMystery("abcd"));
    }

    private static int theLoveLetterMystery(String s) {
        // Write your code here
        int length = s.length();
        int range = length / 2;
        int count = 0;
        for (int i = 0; i < range; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                count += Math.abs(s.charAt(i) - s.charAt(length - 1 - i));
            }
        }

//        if (length % 2 == 0) {
//
//        } else {
//
//        }

        return count;

    }
}
