package Grind75;

import java.awt.*;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        helper(nums,new ArrayList<>(),answer,0);
        return answer;
    }
    private static void helper(int[] nums , ArrayList<Integer> smallerList ,ArrayList<ArrayList<Integer>> largerList , int prevIdx) {
        if (smallerList.size() == nums.length){
            largerList.add(new ArrayList<>(smallerList));
            return;
        }
        for (int i = prevIdx; i < nums.length; i++) {
            if (smallerList.contains(nums[i])){
                continue;
            }
            smallerList.add(nums[i]);
            helper(nums , smallerList , largerList,i);
            smallerList.removeLast();
        }
    }
}
