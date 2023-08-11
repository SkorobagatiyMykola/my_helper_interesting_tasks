package ua.skorobahatyi.help_for_numbers;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {
        System.out.println("==============================");

        BigDecimal b1 = new BigDecimal("123.33");
        BigDecimal b2 = new BigDecimal("123.3300");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2)==0);


    }
}
