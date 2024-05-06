package ua.skorobahatyi.task_from_plexsupply.multythread;

import com.google.common.math.BigIntegerMath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;

public class FileProducer implements Runnable {
    private final static long[] arrayFactorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800,
            479001600, 6227020800l, 87178291200l, 1307674368000l, 20922789888000l, 355687428096000l,
            6402373705728000l, 121645100408832000l, 2432902008176640000l};

    private final BlockingQueue<String> queue;
    private final String inputFileName;

    public FileProducer(BlockingQueue<String> queue, String inputFileName) {
        this.queue = queue;
        this.inputFileName = inputFileName;
    }


    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            int valueInt = 0;
            while ((line = reader.readLine()) != null) {
                //  System.out.println(line);
                try {
                    valueInt = Integer.valueOf(line);

                    String factorialStr = valueInt <= 20 ? String.valueOf(arrayFactorial[valueInt]) :
                            BigIntegerMath.factorial(valueInt).toString();

                    queue.offer(String.format("%-4s = %s\n", line, factorialStr));

                } catch (NumberFormatException ex) {
                    queue.offer(String.format("%-4s - INCORRECT SYMBOLS, IT'S NOT A NUMBER \n", line));
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
