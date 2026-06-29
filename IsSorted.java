package Grind75;

import java.util.HashSet;
import java.util.Set;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 5, 5, 7, 7, 7, 8, 12, 13, 15, 15, 15, 19};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {

        int f = 2;
        int m = 1;
        int p = 0;

        while(f < arr.length){
            if (arr[m]<arr[f] && arr[m]>arr[p]) {
                f++;
                m++;
                p++;
            } else if (arr[m]==arr[f] && arr[m]>arr[p]){
                f++;
                m++;
                p++;
            } else if (arr[m]==arr[f] && arr[m]==arr[p]){
                f++;
                m++;
                p++;
            }else if (arr[m]<arr[f] && arr[m]==arr[p]){
                f++;
                m++;
                p++;
            }else{
                return false;
            }
        }
        return true;
    }
}
