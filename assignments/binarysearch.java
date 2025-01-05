package assignments;

import java.util.*;
public class binarysearch {
    public static void main(String[] args) {


//  GAME QUESTION (easy wala)

//        Scanner sc=new Scanner(System.in);
//        System.out.print("ENTER THE RANGE OF THE GAME = ");
//        int ran=sc.nextInt();
//        System.out.print("ENTER FIRST BAD TERM");
//        int bad= sc.nextInt();
//        int start=0;
//        int end=ran-1;
//        badversion(ran,bad,start, end);
////
//        while(start<=end){
//            int cent=mid(start+((end-start)/2));
//            System.out.println("is ur number "+arr[cent]+"(H(higher) / L(lower) / E(equal))");
//            String anser=sc.nextLine();
//            if(anser.charAt(0)=='E'||anser.charAt(0)=='e'){
//                System.out.println("UR NUMBER IS "+ cent);
//            } else if (anser.charAt(0)=='L'||anser.charAt(0)=='l') {
//                end=cent-1;
//            }else{
//                start=cent+1;
//            }

//        }


// 1. BAD VERSION(easy)


//        Scanner sc=new Scanner(System.in);
//        System.out.print("ENTER THE RANGE OF THE GAME = ");
//        int ran=sc.nextInt();
//        System.out.print("ENTER FIRST BAD TERM =");
//        int bad= sc.nextInt();
//        int[] arr=new int[ran];
//
//        // create array
//        for (int i = 0; i < ran; i++) {
//            arr[i]=i+1;
//        }
//
//        //searching
//        int start=0;
//        int end = ran -1;
//
//        while(start<=end){
//            int mid=start+(end-start)/2;
//
////            //middle index
////            if (end%2==0){
////                mid=(end/2)+1;
////            }else{
////                mid=(end+1)/2;
////            }
//
//            if(arr[mid]<bad) {
//                start=mid+1;
//            } else if (arr[mid]>bad) {
//                end=mid-1;
//            }else{
//                System.out.print(arr[mid]+" is the first bad");
//                break;
//            }
//        }


// 2. FIRST AND LAST POSITION (medium)


//        int[] arr = {5,7,7,8,8,10};
//        int bad=8;
//
//
//        //searching
//        int start=0;
//        int end = arr.length -1;
//        boolean check=false;
//
//        while(start<=end){
////            int mid=start+(end-start)/2;
//            int mid=0;
//            if (end%2==0){
//                mid=(end/2)+1;
//            }else{
//                mid=(end+1)/2;
//            }
//
//            if(arr[mid]<bad) {
//                start=mid+1;
//            } else if (arr[mid]>bad) {
//                end=mid-1;
//            }else{
//                for (int i = mid;i<end+1 ; i++) {
//                    if (arr[i]==bad){
//                        System.out.print(i+" ");
//                    }
//                }
//                check=true;
//                break;
//            }
//
//
//        }
//        if (check==false){
//            System.out.println(-1);
//        }


// 3. TWO sum II


//        int [] numbers = {-1,0};
//        int [] ans=new int[2];
//        int target=-1;
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 1; j < numbers.length; j++) {
//
//                if (numbers[i]!=numbers[j]){
//                    if(numbers[i]+numbers[j]==target){
//                        ans[0]= i+1;
//                        ans[1]= j+1;
//                    }
//
//                }
//
//            }
//        }
//        System.out.print(Arrays.toString(ans));


//        int[] num1={1,2,3,0,0,0};
//        int m=3;
//        int[] num2={2,5,6};
//        int n=3;
//
//        for (int i = m, j=0; i < num1.length && j< num2.length; i++,j++) {
//            num1[i]=num2[j];
//        }
//
//        // bubble sort
////        for (int i = 1; i < num1.length; i++) {
////            if(num1[i]<num1[i-1]){
////                int temp=num1[i];
////                num1[i]=num1[i-1];
////                num1[i-1]=temp;
////            }
////        }
////        System.out.println(Arrays.toString(num1));
//
//        // cyclic sort
//        int i=0;
//        while(i< num1.length){
//            int corct=num1[i]-1;
//            if(num1[i]!=corct){
//                int temp=num1[i];
//                num1[i]=num1[corct];
//                num1[corct]=temp;
//            }else{
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(num1));
//
//
//    }
//    static void badversion(int range,int bad, int start, int end){
//        //create array
//        int[] arr=createarr(range);
//        binary(start,end,arr,bad);
//
//
//    }
//
//    static void binary(int start, int end, int[] array, int tgt){
//        while (start<=end){
//            int cent=mid(end);
//            if (array[cent]==tgt) {
//                System.out.println(array[cent]+" is the first bad");
//            } else if (array[cent]<tgt) {
//                start=cent +1;
//            }else{
//                end=cent-1;
//            }
//
//        }
//    }
//
//    static int mid(int num){
//        if (num%2==0){
//            return (num/2)-1;
//        }else{
//            return ((num+1)/2)-1;
//        }
//    }
//    static int[] createarr(int limit){
//        int[] sample = new int[limit];
//        for (int i = 0; i < limit; i++) {
//            sample[i]=i+1;
//        }
//        return sample;
//
//    }
    }}