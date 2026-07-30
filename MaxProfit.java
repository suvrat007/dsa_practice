package Revision.Grind75;

import java.util.Arrays;
import java.util.Map;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr= {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
