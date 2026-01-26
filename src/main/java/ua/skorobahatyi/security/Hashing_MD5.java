package ua.skorobahatyi.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * generate:  https://www.md5hashgenerator.com/
 * reverse:   https://md5.gromweb.com/
 * */
public class Hashing_MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        //String pass1 = "qwerty123";
        String pass1 = "hello_world ";
        byte[] bytes = messageDigest.digest(pass1.getBytes());

        for (byte b:bytes) {
            System.out.format("%02x",b);
        }
    }
}

// Provided MD5 hash could not be reversed into a string: no reverse string was found.