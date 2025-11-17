package Grind75;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int write = 1;   // next write position (we keep first element)
            int count = 1;   // occurrences of current number

            for (int read = 1; read < nums.length; read++) {
                if (nums[read] == nums[read - 1]) {
                    count++;
                } else {
                    count = 1; // new number starts
                }

                if (count <= 2) {
                    nums[write] = nums[read];
                    write++;
                }
            }

            return write;
    }
}
