package Grind75;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
//        List<Integer> list = new ArrayList<>();
//        int total = 0;
//        for (int i = 0; i < digits.length; i++) {
//            total = total*10 + digits[i];
//        }
//        total= total+1;
//        while (total >= 0) {
//            list.add(total%10);
//            total/=10;
//        }
//        list=list.reversed();
//        int[] finArray = new int[list.size()];
//        for (int i = 0; i < finArray.length; i++) {
//            finArray[i]=list.get(i);
//        }
//        return finArray;

    }
    public int[] plusOne(int[] digits) {
            int n = digits.length;

            // Start from the last digit and handle carry
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits; // No carry needed; return the result
                }
                digits[i] = 0; // Set current digit to 0 and continue for carry
            }

            // If all digits were 9, we need an additional digit
            int[] result = new int[n + 1];
            result[0] = 1; // The most significant digit is 1
            return result;
    }


}
