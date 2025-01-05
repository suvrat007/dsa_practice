package Revision;

import java.util.ArrayList;
import java.util.List;

public class FindMissingAllNumbers {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,3,2,7,8};
        System.out.println(missing(arr));

    }
    static List<Integer> missing(int[] arr){
        int i=0;
        while(i< arr.length){
            int correctInd= arr[i]-1;
            if (arr[i] < arr.length && arr[i]!=arr[correctInd]){
                //swap
                int temp=arr[i];
                arr[i]=arr[correctInd];
                arr[correctInd]=temp;
            }else {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans.add(j+1);
            }
            return ans;
        }
        return ans;
    }
}
