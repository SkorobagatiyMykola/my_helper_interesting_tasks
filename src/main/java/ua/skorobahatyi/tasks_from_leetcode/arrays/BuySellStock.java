package ua.skorobahatyi.tasks_from_leetcode.arrays;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 5, 4, 3, 1};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }

    private static int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        int max = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - min > result)
                result = prices[i] - min;
            if (prices[i] < min)
                min = prices[i];

            /*for (int j = i+1; j <prices.length ; j++) {
                if (prices[j]-prices[i]>result)
                    result=prices[j]-prices[i];
            }*/
        }

        return result;
    }
}
