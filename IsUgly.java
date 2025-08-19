package Grind75;

import java.util.ArrayList;

public class IsUgly {
    public static boolean isUgly(int n) {
        if (n<=0) return false;
        if (n==1) return true;

//        ArrayList<Integer> nums = new ArrayList<>();
//        for (int i = 2; i <= n; i++) {
//            while (n%i==0){
//                nums.add(i);
//                n/= i ;
//            }
//        }
//
//        nums.removeIf(f -> f == 2 || f == 3 || f == 5); // new function known


//        return nums.size()==0;

        while(n%2==0) n/=2 ;
        while(n%3==0) n/=3 ;
        while(n%5==0) n/=5 ;

        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6 ));
    }
}
