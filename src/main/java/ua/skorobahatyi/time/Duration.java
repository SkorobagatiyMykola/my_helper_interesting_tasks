package ua.skorobahatyi.time;

public class Duration {
    public static void main(String[] args) {
        System.out.println("Duration ");

        long startTime = System.currentTimeMillis();

        //  doReallyLongThing();

        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
