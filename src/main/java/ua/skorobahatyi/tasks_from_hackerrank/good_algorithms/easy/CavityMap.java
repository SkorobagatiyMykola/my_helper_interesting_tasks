package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true
 */
public class CavityMap {
    public static void main(String[] args) {
        System.out.println(0%3);

        List<String> list1 = new ArrayList<>(List.of("989", "191", "111"));
        List<String> list2 = new ArrayList<>(List.of("1112", "1912", "1892", "1234"));

        cavityMap(list1);
        cavityMap(list2);

    }

    private static List<String> cavityMap(List<String> grid) {
        // Write your code here

        int[][] arr = new int[grid.size()][grid.size()];

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).length(); j++) {
                arr[i][j] = grid.get(i).charAt(j) - 48;
            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            int count=0;
            StringBuilder strBuilder= new StringBuilder();
            strBuilder.append(arr[i][0]);
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
                    strBuilder.append('X');
                    count++;
                    System.out.println(arr[i][j]);
                } else {
                    strBuilder.append(arr[i][j]);
                }
            }
            strBuilder.append(arr[i][arr.length-1]);
            if (count>0){
                grid.set(i,strBuilder.toString());
            }

            //System.out.println();
        }

     /*   for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();*/

        System.out.println(grid);
        return grid;
    }
}
