package ua.skorobahatyi.tasks_from_hackerrank.numbers;

/**
 *https://www.hackerrank.com/challenges/taum-and-bday/problem?isFullScreen=true
 * Taum and B'day
 * */
public class TaumAndBirthday {
    static int z=1_000_000_000;
    public static void main(String[] args) {
        System.out.println(taumBday(3,3,5,3,4));
        System.out.println(Integer.MAX_VALUE/1000);

        System.out.println(taumBday(z,z,5,3,4));

    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long rez=0;
        if (bc>wc+z)
            rez= (long) b*(wc+z)+ (long)w*wc;
        else if (wc>bc+z)
            rez=(long) b*bc+ (long)w*(bc+z);
        else
            rez=(long) b*bc+ (long)w*wc;

        return rez;

    }
}
