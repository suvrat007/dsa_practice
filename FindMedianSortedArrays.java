package Grind75;

import java.util.ArrayList;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 ={0,0,0,0,0};
        int[] nums2 ={-1,0,0,0,0,0,1};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int i = 0 , j = 0 ;
////        int[] mergedArray = new int[nums1.length+ nums2.length];
////        int k = 0;
//        ArrayList<Integer> mergedArray = new ArrayList<>();
//        while (i<nums1.length && j<nums2.length){
//            if (nums1[i]<nums2[j]){
////                mergedArray[k]=nums1[i];
//                mergedArray.add(nums1[i]);
//                i++;
////                k++;
//            } else if (nums1[i]>nums2[j]) {
////                mergedArray[k]=nums2[j];
//                mergedArray.add(nums2[j]);
//                j++;
////                k++;
//            } else{
////                mergedArray[k] = nums1[i];
//                mergedArray.add(nums1[i]);
//                i++;
//                j++;
////                k++;
//            }
//        }
//        while (j<nums2.length){
////             mergedArray[k]= nums2[j];
//            mergedArray.add(nums2[j]);
//             j++;
////             k++;
//        }
//        while (i<nums1.length){
////            mergedArray[k]= nums1[i];
//            mergedArray.add(nums1[i]);
//            i++;
////            k++;
//        }
//
////        if (mergedArray.length%2==0){
////            return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2.0;
////        }else{
////            return mergedArray[mergedArray.length/2];
////        }
//        int n = mergedArray.size();
//        if (mergedArray.size()%2==0){
//            return (mergedArray.get(n / 2 - 1) + mergedArray.get(n / 2)) / 2.0;
//        }else{
//            return mergedArray.get(n/2);
//        }
//    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> mergedArray = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray.add(nums1[i++]);
            } else {
                mergedArray.add(nums2[j++]);
            }
        }

        while (i < nums1.length) mergedArray.add(nums1[i++]);
        while (j < nums2.length) mergedArray.add(nums2[j++]);

        int n = mergedArray.size();
        if (n % 2 == 0)
            return (mergedArray.get(n / 2 - 1) + mergedArray.get(n / 2)) / 2.0;
        else
            return mergedArray.get(n / 2);
    }
}
