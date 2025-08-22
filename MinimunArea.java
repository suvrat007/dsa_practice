package Grind75;

public class MinimunArea {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowStart = m, rowEnd = -1;
        int colStart = n, colEnd = -1;

        // Scan the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowStart = Math.min(rowStart, i);
                    rowEnd = Math.max(rowEnd, i);
                    colStart = Math.min(colStart, j);
                    colEnd = Math.max(colEnd, j);
                }
            }
        }

        // If no 1's exist
        if (rowEnd == -1) return 0;

        return (rowEnd - rowStart + 1) * (colEnd - colStart + 1);
    }


}
