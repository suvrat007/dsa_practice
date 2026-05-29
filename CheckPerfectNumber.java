package Grind75;

import java.util.ArrayList;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
    public static boolean checkPerfectNumber(int num) {
        // initialize arraylist for divisors
        ArrayList<Integer> list = new ArrayList<>();
        // get divisor add to arraylist
        int i= 1 ;
        while (i<=num/2){
            if(num%i==0){
                list.add(i);
            }
            i++;
        }
        // initialize variable to store sum
        int sum = 0;
        // interate and add elements in arraylist to initialized variable
        for(int n : list){
            sum+=n;
        }
        // return if its equal to num or not
        return sum==num;
    }
}
