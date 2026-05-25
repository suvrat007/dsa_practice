package Grind75;

import java.util.Arrays;

public class LeastPrimeFactor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leastPrimeFactor(6)));
    }
    public static int[] leastPrimeFactor(int n) {
        // make array 1 - n
        // make array [1,2,3,5,7,11,13]
        // check of every element of arr1 if it has a num in arr 2 to divide, if yes then return that
        int[] ans= new int[n];
        int i = 0;
        while(i!=n){
            ans[i]=getMinPrime(i);
            i++;
        }
        return ans;
    }
    private static int getMinPrime(int a){
        if (a==1) return 1;
        int[] arr = {2,3,5,7,11,13};
        for(int n:arr){
            if (a%n==0){
                return n;
            }
        }
        return -1;
    }
}
