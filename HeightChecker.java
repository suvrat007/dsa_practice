package Grind75;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1,1,5,2,1,3};
        System.out.println(heightChecker(arr));
    }
    public static int heightChecker(int[] heights) {
        // as constraint is 100

        // 2 loops
        // 1 to get and increment in 100 at every dex for the number to get repeated values
        // 2 to check in both, if element in height is 1, is 1

        int[] flag = new int[101];
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            flag[heights[i]]+=1;
        }

        int[] expected = new int[heights.length];
        int expectedIdx = 0;
        for (int i = 0; i < flag.length; i++) {
            while (flag[i]>0){
                expected[expectedIdx++] = i;
                flag[i]-=1;
            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (expected[i]!=heights[i]){
                count++;
            }
        }

        return count;

    }
}
