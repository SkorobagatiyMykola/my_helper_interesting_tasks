package ua.skorobahatyi.tasks_from_hackerrank.string;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 * <p>
 * Original alphabet:      abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 */
public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));

    }

    public static String caesarCipher(String s, int k) {

        String result = "";

//        for (int i = 0; i < s.length(); i++) {
//            result += new Character((int) s.charAt(i) + k));
//        }

        return result;
    }

}
