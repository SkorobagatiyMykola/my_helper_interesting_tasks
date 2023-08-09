package ua.skorobahatyi.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * generate:  http://www.sha1-online.com/
 * reverse:   https://sha1.gromweb.com/
 * */
public class Hashing_SHA_1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        //String pass1 = "qwerty123";
        //String pass1 = "hello_world";
        String pass1 = "1234567890";
        byte[] bytes = messageDigest.digest(pass1.getBytes());

        for (byte b:bytes) {
            System.out.format("%02x",b);
        }
    }
}
