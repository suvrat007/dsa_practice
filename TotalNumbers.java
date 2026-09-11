package Grind75;

import java.util.HashSet;

public class TotalNumbers {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i==j || j==k || k==i){
                        continue;
                    }

                    int ones = digits[k];
                    int tens = digits[j];
                    int hunds = digits[i];

                    if (ones%2==0){
                        continue;
                    }

                    if (hunds==0){
                        continue;
                    }

                    int num = 100*hunds + 10*tens + ones;
                    set.add(num);

                }
            }
        }

        return set.size();
    }
}
