package Grind75;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(2302));
    }
    public static boolean isHappy(int n) {
        if (n==1) return true;

        Set<Integer> seen = new HashSet<>();

        int newNum =n;
        do {
            if (seen.contains(newNum)) return false;
            seen.add(newNum);
            newNum=squareSum(0,newNum);
        }while (newNum!=1);

        return true;
    }
    private static int squareSum (int sum , int n){
        if (n<=0) return sum;
        int num = n%10;
        sum+=(num*num);
        return squareSum( sum , n/10);
    }
}
