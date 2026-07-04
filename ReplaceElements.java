package Grind75;

import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(
                Arrays.toString(replaceElements(arr))
        );
    }
    public static int[] replaceElements(int[] arr) {
        // intialize max with -1 (base case)
        // store max number btw current element and lastmax
        // reverse iterate

        int max = -1;

        for (int i = arr.length-1; i >= 0 ; i--) {
            int newMax = Math.max(arr[i], max);
            arr[i]=max;
            max=newMax;
        }

        return arr;
    }
}
