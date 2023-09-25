package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 * <p>
 * Original alphabet:      abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 */
public class CaesarCipher {
    private final static int upperCaseInd = 65;
    private final static int lowCaseInd = 97;
    private final static int countSymbols = 26;

    public static void main(String[] args) {
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
        System.out.println(caesarCipher("middle-Outz", 3));
        System.out.println(caesarCipher("DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.", 45));


        // My helper Problems was in the bounds. I solved it.
//        char c1 = '{';
//        char c2 = '[';
//        System.out.println(c1 + " = " + (int) c1);
//        System.out.println(c2 + " = " + (int) c2);

    }

    public static String caesarCipher(String s, int k) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);
            if (num >= upperCaseInd && num < upperCaseInd + countSymbols) {
                num = ((num - upperCaseInd) + k) % 26;
                char ch = (char) (upperCaseInd + num);
                result += ch;
            } else if (num >= lowCaseInd && num < lowCaseInd + countSymbols) {
                num = ((num - lowCaseInd) + k) % 26;
                char ch = (char) (lowCaseInd + num);
                result += ch;
            } else {
                char ch = (char) (s.charAt(i));
                result += ch;
            }
        }

        return result;
    }

}
