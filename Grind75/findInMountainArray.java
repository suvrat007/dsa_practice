//package Grind75;
//
//import com.sun.jdi.connect.IllegalConnectorArgumentsException;
//
//public class findInMountainArray {
//
//    interface MountainArray {
////        public static int get(int index) {}
////        public static int length() {}
////  }
//    public int findInMountainArray(int target, MountainArray mountainArr) {
////        int[] arr = new int[MountainArray.length()];
////        for (int i = 0; i < arr.length; i++) {
////            arr[i]=MountainArray.get(i);
////        }
//
//        // findin peak
//        int peak=0;
//        int start=0;
//        int end = MountainArray.length()-1;
//
//
//        while (start<=end){
//            peak = start+(end-start)/2;
//
//            if (MountainArray.get(peak)<MountainArray.get(peak+1)) {
//                start = peak+1;
//            }else{
//                end=peak ;
//            }
//        }
//        int small= -1;
//        int big= -1;
//
//        start=0;
//        end=peak;
//
//        while(start<=peak){
//            int mid = start+(peak-start)/2;
//
//            if (MountainArray.get(mid)==target){
//                small=mid;
//            } else if (MountainArray.get(mid)<target) {
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        start=peak+1;
//        end = MountainArray.length()-1;
//        while(peak<=end){
//            int mid = start+(peak-start)/2;
//
//            if (MountainArray.get(mid)==target){
//                big =mid;
//            } else if (MountainArray.get(mid)<target) {
//                end=mid-1;
//            }else {
//                start=mid+1;
//            }
//        }
//
//        if(small==-1 && big==-1){
//            return -1;
//        } else if (small!=-1 && big!=-1) {
//            return Math.min(small,big);
//        }else{
//            return small != -1 ? small : big;  // Return the found index from either part
//
//        }
//
//    }
//}
