package assignments;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board=new int[][]{{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};

        if (solve(board)){
            display(board);
        }else{
            System.out.println("no");
        }
    }
    static boolean solve(int[][] board){
        int n= board.length;
        int col= -1;
        int row= -1;
        boolean emptySpace=false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptySpace=true;
                    break;
                }
            }
            if(emptySpace==true){
                break;
            }

        }
        if (emptySpace==false){
            return true;
        }

        for (int i = 1; i <= n; i++) {
            if (isSafe(board,row,col,i)){
                board[row][col]=i;
                if(solve(board)){
                    return true;
                }else{
                    board[row][col]=0;
                }
            }
        }

        return false;
    }
    static void display(int[][] board){
        for(int[]row:board){
            for (int ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }



    static boolean isSafe(int[][] board, int row, int col, int num){
        //check row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==num){
                return false;
            }
        }

        //check col
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]==num){
                return false;
            }
        }

        //check box
        int sqrt=(int)(Math.sqrt(board.length));
        int starRow = row - row % sqrt;
        int startCol= col - col % sqrt;

        for (int i = starRow; i <starRow+sqrt ; i++) {
            for (int j = startCol; j < startCol+sqrt; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }

        }
        return true;

    }
}
