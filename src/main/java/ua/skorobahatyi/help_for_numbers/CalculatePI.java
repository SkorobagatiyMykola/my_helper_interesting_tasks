package ua.skorobahatyi.help_for_numbers;

import static java.lang.Math.*;

public class CalculatePI {
    public static void main(String[] args) {
        double[][] arr1= createArray(1_000);
        System.out.println(calculatePI(arr1));
        System.out.println(calculatePI2(arr1));

    }

    private static double calculatePI(double[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (pow(array[i][0],2) + pow(array[i][1],2) <= 1) {
                sum++;
            }
        }

        return (double) sum*4/array.length;
    }

    private static double calculatePI2(double[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i][0] * array[i][0] + array[i][1] * array[i][1] <= 1d) {
                sum++;
            }
        }

        return (double) sum*4/array.length;
    }


    private static double[][] createArray(int size) {
        double[][] array = new double[size][2];

        for (int i = 0; i < size; i++) {
            array[i][0] = random();
            array[i][1] = random();
        }

        return array;
    }
}
