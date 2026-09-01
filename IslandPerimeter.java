package Grind75;

public class IslandPerimeter{
    public int islandPerimeter(int[][] grid) {
        // if all sides of 1 is 0-- dont count, can only be considered if its the only one
        // count perimeter or that side which is adjacent to 1, when adjecent is 0
        // numbers can be btw 1-3

        int count =0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++){
                if (grid[row][col]==1){
                    // left
                    if (col==0 || grid[row][col-1]==0){
                        count++;
                    }
                    // right
                    if (col==grid[0].length-1 || grid[row][col+1]==0){
                        count++;
                    }
                    // bottom
                    if (row==grid.length-1 || grid[row+1][col]==0){
                        count++;
                    }
                    // top
                    if (row==0 || grid[row-1][col]==0){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
