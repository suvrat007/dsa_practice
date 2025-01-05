package Revision.Grind75;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr= {2,4,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices){

        int maxDiff=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i]<prices[j] && prices[j]-prices[i]>maxDiff ){
                    maxDiff=prices[j]-prices[i];
                }
            }
        }
        if (maxDiff>0){
            return maxDiff;
        }else {
            return 0;
        }

    }
}
