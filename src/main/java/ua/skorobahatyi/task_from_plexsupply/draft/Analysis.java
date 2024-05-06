package ua.skorobahatyi.task_from_plexsupply.draft;

import com.google.common.math.BigIntegerMath;

import java.io.*;
import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

/**
 * Analysis of the problem
 */
public class Analysis {

    private final static long[] arrayFactorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800,
            479001600, 6227020800l, 87178291200l, 1307674368000l, 20922789888000l, 355687428096000l,
            6402373705728000l, 121645100408832000l, 2432902008176640000l};

    private final static String[] arrayFactorialStr = new String[10000];
    static {
        arrayFactorialStr[0]="1";
        arrayFactorialStr[1]="1";
        arrayFactorialStr[2]="2";
        arrayFactorialStr[3]="6";
        arrayFactorialStr[4]="24";
        arrayFactorialStr[5]="120";
        arrayFactorialStr[6]="720";
        arrayFactorialStr[7]="5040";
        arrayFactorialStr[8]="40320";
        arrayFactorialStr[9]="362880";
        arrayFactorialStr[10]="3628800";
        arrayFactorialStr[11]="39916800";
        arrayFactorialStr[12]="479001600";
        arrayFactorialStr[13]="6227020800";
        arrayFactorialStr[14]="87178291200";
        arrayFactorialStr[15]="1307674368000";
        arrayFactorialStr[16]="20922789888000";
        arrayFactorialStr[17]="355687428096000";
        arrayFactorialStr[18]="6402373705728000";
        arrayFactorialStr[19]="121645100408832000";
        arrayFactorialStr[20]="2432902008176640000";

    }

    public static void main(String[] args) throws IOException {


        String path = "src/main/java/ua/skorobahatyi/task_from_plexsupply/input.txt";
        FileReader reader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(reader);

        FileWriter writer = new FileWriter("output.txt");
        PrintWriter printWriter = new PrintWriter(writer);


        //findProblemsMaxElement(bufferedReader);
        //findMapFrequencyAppearance(bufferedReader);
        printResult(printWriter, bufferedReader);

        writer.close();
        printWriter.close();
        bufferedReader.close();
        reader.close();


        System.out.println("==============================================");
    }


    private static void printResult(PrintWriter printWriter, BufferedReader bufferedReader) throws IOException {
        int valueInt;
        long begin = System.currentTimeMillis();
        while (bufferedReader.ready()) {
            String valueStr = bufferedReader.readLine();

            try {
                valueInt = Integer.valueOf(valueStr);
                //String factorial = BigIntegerMath.factorial(valueInt).toString();


                BigInteger factorialBig = BigIntegerMath.factorial(valueInt);


//                if (arrayFactorialStr[valueInt]==null) {
//                    BigInteger factorialBig = BigIntegerMath.factorial(valueInt);
//                    arrayFactorialStr[valueInt] = factorialBig.toString();
//                }


                //printWriter.printf("%-4s = %s\n", valueStr, factorial);
               printWriter.printf("%-4s = %d\n", valueStr, factorialBig);
               // printWriter.printf("%-4s = %d\n", valueStr, 15);

            } catch (NumberFormatException ex) {
                // System.out.println("line " + i + ":  " + valueStr);
                printWriter.printf("%-4s - INCORRECT SYMBOLS, IT'S NOT A NUMBER \n", valueStr);
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("All time: " + (end - begin) + " milli sec");
    }

    private static void findMapFrequencyAppearance(BufferedReader bufferedReader) throws IOException {
        Map<Integer, Integer> map = new TreeMap<>();

        int valueInt;
        int i = 0;
        while (bufferedReader.ready()) {
            String valueStr = bufferedReader.readLine();
            i++;
            try {
                valueInt = Integer.valueOf(valueStr);
                map.put(valueInt,
                        map.containsKey(valueInt) ? map.get(valueInt) + 1 : 1);

            } catch (NumberFormatException ex) {
                // System.out.println("line " + i + ":  " + valueStr);
            }
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + ":  " + map.get(key));
        }

    }

    private static void findProblemsMaxElement(BufferedReader bufferedReader) throws IOException {
        int i = 0;
        int max = 0;

        int maxLineNum = 0;

        int valueInt = 0;
        while (bufferedReader.ready()) {
            String valueStr = bufferedReader.readLine();
            i++;
            try {
                valueInt = Integer.valueOf(valueStr);
            } catch (NumberFormatException ex) {
                System.out.println("line " + i + ":  " + valueStr);
            }

            if (max < valueInt) {
                max = valueInt;
                maxLineNum = i;
            }
        }

        System.out.println(max + "This is line:" + maxLineNum);
    }
}
