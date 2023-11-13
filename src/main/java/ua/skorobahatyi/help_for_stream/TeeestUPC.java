package ua.skorobahatyi.help_for_stream;

import java.util.List;

public class TeeestUPC {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sumOddOld = 0;
        for (Integer i : list) {
            if (i % 2 != 0) {
                sumOddOld += i;
            }
        }

        Integer sumOddOld2 = list.stream()
                .filter(el -> el % 2 != 0)
                .reduce(0, Integer::sum);

        System.out.println(sumOddOld);
        System.out.println(sumOddOld2);
    }

}
