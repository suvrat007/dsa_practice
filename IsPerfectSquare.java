package Grind75;

public class IsPerfectSquare {
    public static boolean isPerfectSquare(int num) {
//        if (num<0) return false;
//        if (num==0 || num==1) return true;
//        return helper(num , 1);
        if (num < 2) return true;

        long left = 2, right = num / 2;  // use long to prevent overflow
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;

            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;

    }

    private static boolean helper(int n, int i) {
        if (i*i>n) return false;
        if (i*i==n) return true;
        return helper(n,i+1);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
