package Grind75;

import java.util.Arrays;

public class NumDistinct {
//    public int numDistinct(String s, String t) {
//        int m = s.length();
//        int n = t.length();
//
//        int[][] dp = new int[m+1][n+1];
//
//        for (int i = 0; i <= m; i++) {
//            dp[i][0] = 1;
//        }
//
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                dp[i][j] = dp[i-1][j];
//                if (s.charAt(i-1)==t.charAt(j-1)){
//                    dp[i][j]+=dp[i-1][j-1];
//                }
//            }
//        }
//
//        return dp[m][n];
//    }

    public int numDistinct(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();

        int[][] memo = new int[lenS][lenT];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(s, t, lenS - 1, lenT - 1, memo);
    }

    public int solve(String s, String t, int i, int j, int[][] memo) {
        if (j < 0) {
            return 1;
        }

        if (i < 0) {
            return 0;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            memo[i][j] = solve(s, t, i - 1, j - 1, memo)
                    + solve(s, t, i - 1, j, memo);
        } else {
            memo[i][j] = solve(s, t, i - 1, j, memo);
        }

        return memo[i][j];
    }
}
