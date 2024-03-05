package ua.skorobahatyi.help_for_string;

public class CompareCreationString {

    private static final int COUNT = 100_000_000;

    public static void main(String[] args) {

        long startTest1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            String s1 = new String(String.valueOf(i));
        }
        long endTest1 = System.currentTimeMillis();

        System.out.printf("Creation String By new(), time: %d\n", (endTest1 - startTest1));


        long startTest2 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            String s1 = "test" + i;
        }
        long endTest2 = System.currentTimeMillis();

        System.out.printf("Creation String By concat, time: %d\n", (endTest2 - startTest2));
    }
}
