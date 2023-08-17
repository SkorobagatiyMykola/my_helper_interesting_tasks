package ua.skorobahatyi.tasks_from_hackerrank.numbers;

import java.util.List;

public class birthdayCakeCandles {
    public static void main(String[] args) {

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max=candles.get(0);

        for (int i = 0; i < candles.size(); i++) {
           if (candles.get(i)>max)
               max=candles.get(i);
        }
        int count=0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i)==max)
                count++;
        }

        return count;
    }
}
