package practise;

import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {

//        QUESTION 1


//        int[] input= {1,2,3,4,5};
//        trisum(input);


//        QUESTION 2

//        int [] arr = {1, 4, 45, 6, 10, -8};
//        minmax(arr,0,arr[0],arr[0]);


//        QUESTION 3          (GOOD QUESTION)

//        int[] input={-1,0,3,5,9,12};
//        int target=12;
//        int start=0;
//        int end=input.length-1;
//        binary(input,target,start,end);

//       QUESTION 4 (kuch naya pata chala)
//        String input="geekS";
//        upper(input,0);


//        QUESTION 5 ( learnt effective eay of reversal)
//        String [] arr = {"H","a","n","n","a","h"};
//        reverse(arr,arr.length-1,0);

//        QUESTION 6

//        int limit=5;
//        print(limit,1);
    }

    static void trisum(int[] arr) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int num = 0;
        int[] ans = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            num = arr[i] + arr[i - 1];
            ans[i - 1] = num;
        }
        System.out.println(Arrays.toString(ans));
        trisum(ans);
    }

    static void minmax(int[] arr, int i, int max, int min) {
//        min = arr[0];
//        max = arr[0];
        if (arr[i]>max){
            max=arr[i];
        }
        if (arr[i]<min){
            min=arr[i];
        }
        if (i==arr.length-1){
            System.out.println("MAX = "+ max);
            System.out.println("MIN = "+ min);
            return;
        }
        minmax(arr,i+1, max,min);

    }
    static void binary(int[] arr, int target, int start, int end){
        if(start>end){
            System.out.println(-1);
            return;
        }
        //mid
        int mid= start + (end - start) / 2;
        if (arr[mid]>target){
//                end=mid-1;
            binary(arr,target,start, mid-1);                                 // NOTE

        }else if (arr[mid]<target){
//                start=mid+1;
            binary(arr,target,mid+1, end);

        }else if(arr[mid]==target){
            System.out.println(mid);
            return;
        }

    }
    static void upper(String var,int i){
        if (Character.isUpperCase(var.charAt(i))){                           // NEW INBUILT FUNCTION
            System.out.println(var.charAt(i));
            return;
        }
        upper(var,i+1);
    }

    static void reverse(String[] a,int start, int end){
//        String[] ans=new String[a.length];
//        if (start>=0){
//            ans[end]=a[start];
//            reverse(a,start-1,end);
//        }else{
//            System.out.println(Arrays.toString(ans));
//            return;
//        }
        if(start>=end){                                                       //NOTE
            String temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            reverse(a,start-1,end+1);
        }else{
            System.out.println(Arrays.toString(a));
        }

    }
    static void print(int n,int i){
        if (i>n){
            return;
        }
        System.out.print(i + " ");
        print(n,i+1);
    }

}


