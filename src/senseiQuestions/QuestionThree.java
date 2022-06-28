package senseiQuestions;

import java.util.Arrays;

public class QuestionThree {
    /**You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
    Find and return the maximum profit you can achieve.
    Example 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 7
    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit 5-14. Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3. Total profit is 4 + 3 = 7.
    Example 2:
    Input: prices = [1,2,3,4,5]
    Output: 4
    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit 5-14. Total profit is 4.
    Example 3:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.*/

    public static void solution(){
        int [] prices = {7, 1, 5, 3, 6, 4};
        int [] possibleProfit1 = new int[5];
        int [] possibleProfit2 = new int[4];
        int [] possibleProfit3 = new int[3];
        int [] possibleProfit4 = new int[2];
        int [] possibleProfit5 = new int[1];

        for (int i = 0; i < prices.length; i++ ){
            for (int j = i+1; j < prices.length; j++){
                int possibleProfit = prices[i] - prices[j];
                possibleProfit1[i] = possibleProfit;
            }
        }

        System.out.println(Arrays.toString(possibleProfit1));

        int maximumProfit = 0;
        for (int i = 0; i < possibleProfit1.length; i++){
            if(possibleProfit1[i] > maximumProfit) maximumProfit = possibleProfit1[i];
        }
        System.out.println(maximumProfit);
    }


    public static void main(String[] args) {
        solution();
    }
}
