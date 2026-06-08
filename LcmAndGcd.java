package Grind75;

import java.util.Arrays;

public class LcmAndGcd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmAndGcd(10000,10000)));
    }
    public static int[] lcmAndGcd(int a, int b) {
        int[] ans = new int[2];
        if(a==b && a==1) {
            ans[0]=1;
            ans[1]=1;
            return ans;
        }
        if(a==b && a==0) return ans;

        int gcd = calGCD(Math.max(a, b), Math.min(a, b));
        int lcm = (a / gcd) * b;

        ans[0] = lcm;
        ans[1]= gcd;
        return ans;
    }

    private static int calGCD (int a, int b ){
        if (b==0) return a;
        return calGCD(b,a%b);
    }
}
