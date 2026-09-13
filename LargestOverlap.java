package Grind75;

public class LargestOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        int n = A.length;
        int maxOverlaps = Integer.MIN_VALUE;

        for (int rowOffset = -n+1; rowOffset < n; rowOffset++) {
            for (int colOffset = -n+1; colOffset < n; colOffset++) {
                int overlap = countOverlaps(A,B,rowOffset,colOffset);

                maxOverlaps = Math.max(maxOverlaps,overlap);
            }
        }

        return maxOverlaps;
    }

    public int countOverlaps(int[][] A, int[][] B, int rowOffset, int colOffset){
        int n = A.length;
        int count =0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int bi = i + rowOffset;
                int bj = j + colOffset;

                if (bi<0 || bi>=n || bj<0 || bj>=n){
                    continue;
                }

                if (A[i][j]==1 && B[bi][bj]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
