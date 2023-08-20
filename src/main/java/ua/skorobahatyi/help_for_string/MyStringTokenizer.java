package ua.skorobahatyi.help_for_string;

import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        System.out.println("My String Tokenizer");

        String str="He is a very very good boy, isn't he?";


       // String str = "Good news everyone!";
        //StringTokenizer tokenizer = new StringTokenizer(str,"ny");
        StringTokenizer tokenizer = new StringTokenizer(str," !,?._'@");
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

    }
}
