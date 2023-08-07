package ua.skorobahatyi.my_help_for_numbers;

import java.util.ArrayList;
import java.util.List;

public class HelperForPrimeNumber {

    public boolean isPrimeNumber(int number) {
        int div = (int) Math.sqrt(number);
        int count = 0;
        if (number < 2)
            return false;

        for (int i = 1; i <= div; i++) {
            if (number % i == 0)
                count++;
            if (count > 1)
                return false;
        }

        return true;
    }

    public boolean isPrimeNumberQuickCheck(int number, int[] arrayPrimeNumbers) {
        for (int div : arrayPrimeNumbers) {
            if (number % div == 0)
                return false;
        }

        return true;
    }

    public List<Integer> createListForPrimeNumbers(int begin, int end) {
        List<Integer> list = new ArrayList<>();
        for (int number = begin; number <= end; number++) {
            if (isPrimeNumber(number)) {
                list.add(number);
            }
        }
        return list;
    }


}
