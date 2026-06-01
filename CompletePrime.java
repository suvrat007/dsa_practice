package Grind75;

public class CompletePrime {

    public static void main(String[] args) {
        System.out.println(completePrime(7));
    }
    public static boolean completePrime(int num) {
        if (!isPrime(num)) return false;

        int digits = 0;
        int x = num;
        while (x>0){
            x/=10;
            digits++;
        }

        for (int i = 1; i <= digits; i++) {
            if (!isPrime(getPrefix(num,digits,i))) return false;
        }

        for (int i = 1; i <= digits; i++) {
            if (!isPrime(getSuffix(num, i))) return false;
        }

        return true;

    }

    // function to check for prime, if not prime, change global constant
    public static boolean isPrime(int n ){
        if (n<=1) return false;
        if (n==2) return true;
        if (n%2==0) return false;
        for (int i = 3; i * i <= n; i+=2) {
            if (n%i==0) return false;
        }
        return true;
    }

    // function to get suffixes and check recursively
    public static int getSuffix(int num, int k) {
        int pow10 = 1;
        for (int i = 0; i < k; i++) {
           pow10 *= 10;
        }
        return num % pow10;
    }

    // function to get prefixes and check recursively
    public static int getPrefix(int num , int digits ,int k) {
        int toDropFromRight = digits - k;
        while(toDropFromRight-- > 0){
            num/=10;
        }
        return num;
    }
}
