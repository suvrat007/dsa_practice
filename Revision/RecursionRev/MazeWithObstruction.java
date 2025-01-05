package Revision.RecursionRev;

public class MazeWithObstruction {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        allPath("", 0,0,board );

    }

    static void obstruction(int row, int col, boolean[][] board,String p){
        if (row== board.length-1 && col== board[0].length-1){
            System.out.println(p);
            return;
        }

        if (!board[row][col]){
            return;
        }

        if(row<board.length-1){
            obstruction(row+1 , col ,board, p+'H');
        }
        if (col< board.length-1){
            obstruction(row , col+1 ,board, p+'V');

        }
        if(row< board.length-1 && col< board.length-1){
            obstruction(row+1 , col+1 ,board, p+'D');
        }

    }

    // for all tpath we wld need back tracking coz varna ek hi jagah par ghoomta rahega
    // we dont want it to repeat where it went toh where ever it goes usko false kardenge.

    static void allPath(String p , int row , int col , boolean[][] board){
        if (row==2 && col==2){
            System.out.println(p);
            return;
        }

        if (!board[row][col]){
            return;
        }

        board[row][col]=false;

        if(row<board.length-1){
            allPath(p+'V',row+1,col,board);
        }
        if (col< board.length-1){
            allPath(p+'R',row,col+1,board);
        }
        if(row< board.length-1 && col< board.length-1){
            allPath(p+'D',row+1,col+1,board);
        }
        if (row>0){
            allPath(p+'U',row-1, col , board);
        }
        if (col>0){
            allPath(p+'L',row,col-1, board);
        }

        board[row][col]=true;
    }
}
