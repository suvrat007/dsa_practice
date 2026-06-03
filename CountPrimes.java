package Grind75;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(1));
    }
    public static int countPrimes(int n) {
//        if (n<=1) return 0;
        int[] prime = new int[n+1];

        for (int i = 2; i <= n; i++) {
            prime[i]=1;
        }

        for (int i = 2; i*i <=n ; i++) {
            if (prime[i]==1){
                for (int j = i*i; j <=n ; j+=i) {
                    prime[j]=0;
                }
            }
        }

        int count = 0 ;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]==1) count++;
        }

        return count;
    }
}
