package ua.skorobahatyi.helper_for_tests.test_samsung;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cryptho {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        TestB.print();
//        byte[] message = "Hello, World!".getBytes();
//
//        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//
//        messageDigest.update(message);
//        // Step 4: Run the hashing function
//        byte[] digest = messageDigest.digest();
//
//        System.out.println(digest);
//        // Step 5: Print the digest in HEX
//        System.out.println("digest: " + bytesToHex(digest));
    }


    public static String bytesToHex(byte[] bytes) {
        StringBuilder out = new StringBuilder();
        for (byte b : bytes) {
            out.append(String.format("%02X", b));
        }
        return out.toString();
    }
}
