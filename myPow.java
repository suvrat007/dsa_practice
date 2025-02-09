package Grind75;

public class myPow {
    public static void main(String[] args) {
        System.out.println(myPow(0.0001,2147483647));
    }


    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;  // x^0 is always 1
        }
        if (n < 0) {
            return myPowHelper(1 / x, -n);  // Handle negative exponent by inverting the base
        }
        return myPowHelper(x, n);
    }

    public static double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1.0;  // Base case: any number raised to the power of 0 is 1
        }

        double half = myPowHelper(x, n / 2);  // Recursive call to calculate x^(n/2)

        if (n % 2 == 0) {  // If n is even
            return half * half;
        } else {  // If n is odd
            return half * half * x;
        }
    }
}
