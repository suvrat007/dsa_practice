package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr1= {2,5,6};
        int m=6,n=3;
        merging(arr,arr1,m,n);

//        arr=mergesort(arr);
//        System.out.println(Arrays.toString(arr));

    }
    static int[] mergesort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){

        int i =0;
        int j=0;
        int[] mix=new int[first.length+second.length];
//        if (first.length<second.length){
//            while(i<first.length){
//                if(first[i]<second[i]){
//                    mix[i]=first[i];
//                    i++;
//                }else{
//                    mix[i]=second[i];
//                    i++;
//                }
//            }
//        }else{
//            while(i<second.length){
//                if(first[i]<second[i]){
//                    mix[i]=second[i];
//                    i++;
//                }else{
//                    mix[i]=first[i];
//                    i++;
//                }
//            }
//
//        }
        int k=0;
        while(i<first.length && j< second.length){
            if (first[i]<second[i]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(i< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }


    // QUESTIONS

    static void merging(int[] num1, int[] num2,int m,int n){
        int i=0;
        int j=0;


        while(i< m){
            if(num1[i]>num2[j] && j<=n){
                // swap

                int temp=num1[i];
                num1[i]=num2[j];
                num2[j]=temp;

                //add in last
                num1[num1.length- num2.length+j]=num2[j];
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(num1));
    }
}
