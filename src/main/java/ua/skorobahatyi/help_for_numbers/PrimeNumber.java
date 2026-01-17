package ua.skorobahatyi.help_for_numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrimeNumber(2021));

        System.out.println(2021/43);
    }

    public boolean isPrimeNumber(int number) {
        int div = (int) Math.sqrt(number);
        int count = 0;
        if (number < 2)
            return false;

        for (int i = 1; i <= div; i++) {
            if (number % i == 0){
                count++;
                System.out.println("Div: "+i);
            }
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
