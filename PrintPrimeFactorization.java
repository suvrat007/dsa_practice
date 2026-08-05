package Grind75;

import java.util.ArrayList;

public class PrintPrimeFactorization {
    public static void main(String[] args) {
        printPrimeFactorization(12);
    }
    public static void printPrimeFactorization(int n) {
        int x = n;

        for (int i = 2; i*i <=x ; i++) {
            while(x%i==0){
                System.out.print(i + " ");
                x/=i;
            }
        }

        if (x > 1) System.out.print(x);
    }


}
