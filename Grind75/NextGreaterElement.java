package Grind75;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));

    }
//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        Stack<Integer> n1 = new Stack<>();
//        Stack<Integer> arr = new Stack<>();
//
//        for (int i = 0; i < nums1.length; i++) {
//            n1.push(nums1[i]);
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//            int item = n1.pop();
//            if (nums2[i]==item){
//                if (i== nums2.length ){
//                    arr.push(-1);
//                } else if (i < nums2.length) {
//                    if (nums2[i+1] > nums2[i]){
//                        arr.push(nums2[i+1]);
//                    }
//                }
//            }
//        }
//
//        return arr;
//    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int i = 0, j=1;

        while (i<nums1.length && j< nums2.length){

            if (nums1[i]!=nums2[j-1]){
                j++;
            } else if (j== nums2.length-1) {
                arr[i]= -1;
                i++;
                j=1;
            } else{
                if (nums2[j-1] < nums2[j]){
                    arr[i]=nums2[j];
                    i++;
                    j=1;
                }else{
                    arr[i]= -1;
                    i++;
                    j=1;
                }

            }


        }
        return arr;
    }
}
