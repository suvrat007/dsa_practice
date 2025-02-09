package Grind75;
import java.io.*;
import java.util.Stack;

import static java.lang.Integer.toBinaryString;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] ans = new int[maxLength + 1]; // Result array with extra space for carry
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = maxLength; // Index for the result array

        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? arr1[i--] - '0' : 0; // Get bit from arr1 or 0 if out of bounds
            int bit2 = (j >= 0) ? arr2[j--] - '0' : 0; // Get bit from arr2 or 0 if out of bounds

            int sum = bit1 + bit2 + carry; // Add bits and carry
            ans[k--] = sum % 2;            // Store the result bit (0 or 1)
            carry = sum / 2;               // Update carry
        }

        // Convert the result array to a string
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < ans.length; index++) {
            // Skip leading zero in the result
            if (index == 0 && ans[index] == 0) continue;
            result.append(ans[index]);
        }

        return result.toString();
    }


}
