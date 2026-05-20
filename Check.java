package Grind75;

public class Check {
    public static void main(String[] args) {
        int[] arr = {2,2,2};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false;
        }

        return true;
    }
}
