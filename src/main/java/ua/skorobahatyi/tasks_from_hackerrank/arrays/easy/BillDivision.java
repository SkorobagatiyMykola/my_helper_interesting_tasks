package ua.skorobahatyi.tasks_from_hackerrank.arrays.easy;

import java.util.List;

/**
 * Bill Division
 * https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
 * */
public class BillDivision {

    public static void main(String[] args) {
        List<Integer> list = List.of(3,10,2,9);
        bonAppetit(list,1,12);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum =0;
        for (int i = 0; i < bill.size(); i++) {
            if (i!=k) {
                // System.out.println("--"+bill.get(i));
                sum+=bill.get(i);
            }
        }
        // System.out.println(sum);
        int sum2=sum/2;

        if (sum2!=b){
            System.out.println(b-sum2);
        } else{
            System.out.println("Bon Appetit");
        }

    }
}
