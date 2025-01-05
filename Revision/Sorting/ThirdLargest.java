package Revision.Sorting;


import java.util.ArrayList;

public class ThirdLargest {


    public static void main(String[] args) {
        int[] arr={3,2,1};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
//        ArrayList<Integer> list=new ArrayList<>();
        int[] ans = new int[3];
        int max = 0;
        int newInd=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
            ans[newInd]=nums[max];
            nums[max]=0;
            newInd++;
            if(newInd==2){
                break;
            }
        }
        if (ans.length==2){
            return ans[2];
        }else{
            return ans[0];
        }




    }

}
