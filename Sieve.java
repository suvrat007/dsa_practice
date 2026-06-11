package Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    public int[] sieve(int n) {
        int[] prime = new int[n+1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]==1){
                for (int j = i*i; j <= n; j+=i) {
                    prime[j]=0;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]==1){
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
