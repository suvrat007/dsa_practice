package Revision.Grind75;

import java.util.Arrays;
import java.util.Map;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,8,4};
        System.out.println(maxProfit(arr));
    }
//    public static int maxProfit(int[] prices){
//
//        int maxDiff=0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                if (prices[i]<prices[j] && prices[j]-prices[i]>maxDiff ){
//                    maxDiff=prices[j]-prices[i];
//                }
//            }
//        }
//        if (maxDiff>0){
//            return maxDiff;
//        }else {
//            return 0;
//        }
//
//    }
//    public static int maxProfit(int[] prices){
//
//        Arrays.sort(prices);
//        return prices[prices.length-1]-prices[0];
//    }

    public static int maxProfit(int[] prices){
        // traverse forward
        // check minimum behind
        // keep updating profit

        int maxProf = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            maxProf = Math.max(maxProf,prices[i]-min);
            min = Math.min(min,prices[i]);
        }

        return maxProf;
    }
}
