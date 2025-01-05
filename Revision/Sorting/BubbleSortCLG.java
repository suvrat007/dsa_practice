package Revision.Sorting;

import java.util.Arrays;

public class BubbleSortCLG {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5};
        sort(arr);
    }
    public static void sort(int[] arr ){
        int swaps = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    swaps++;
                }
            }
        }
        if (swaps==0){
            System.out.println("Arrays is sorted");
            return;
        }

        System.out.println(swaps);
//        System.out.println(Arrays.toString(arr));
    }
}
