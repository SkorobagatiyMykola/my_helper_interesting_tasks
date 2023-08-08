package ua.skorobahatyi.help_for_string;

public class CompareStrings {

    private static final int COUNT = 100_000;

    public static void main(String[] args) {
        System.out.println("Compare String and StringBuilder ");

        long startTest1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringAppend();
        }
        long endTest1 = System.currentTimeMillis();

        System.out.printf("Concatenation string (+), time: %d\n", (endTest1 - startTest1));


        long startTest2 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringAppendBuilder();
        }
        long endTest2 = System.currentTimeMillis();

        System.out.printf("String Builder, time: %d\n", (endTest2 - startTest2));

        long startTest3 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringFormatter();
        }
        long endTest3 = System.currentTimeMillis();

        System.out.printf("String Formatter, time: %d\n", (endTest3 - startTest3));

    }

    private static String stringFormatter() {
        String res = String.format("foo %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s,",
                ", bar1", ", bar2", ", bar3", ", bar4", ", bar5", "bar6", ", bar7", ", bar8", ", bar9", ", bar10",
                "bar11", ", bar12", ", bar13", ", bar14", ", bar15", "bar16", ", bar17", ", bar18", ", bar19", ", bar20");

        return res;
    }

    public static String stringAppend() {
        String s = "foo ";
        s += ", bar1";
        s += ", bar2";
        s += ", bar3";
        s += ", bar4";
        s += ", bar5";
        s += ", bar6";
        s += ", bar7";
        s += ", bar8";
        s += ", bar9";
        s += ", bar10";
        s += ", bar11";
        s += ", bar12";
        s += ", bar13";
        s += ", bar14";
        s += ", bar15";
        s += ", bar16";
        s += ", bar17";
        s += ", bar18";
        s += ", bar19";
        s += ", bar20";

        return s;
    }

    public static String stringAppendBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("foo");
        sb.append(", bar1");
        sb.append(", bar2");
        sb.append(", bar3");
        sb.append(", bar4");
        sb.append(", bar5");
        sb.append(", bar6");
        sb.append(", bar7");
        sb.append(", bar8");
        sb.append(", bar9");
        sb.append(", bar10");
        sb.append(", bar11");
        sb.append(", bar12");
        sb.append(", bar13");
        sb.append(", bar14");
        sb.append(", bar15");
        sb.append(", bar16");
        sb.append(", bar17");
        sb.append(", bar18");
        sb.append(", bar19");
        sb.append(", bar20");

        return sb.toString();
    }
}
