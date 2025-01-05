package practise;

public class Nknights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(knight(board,0));

    }
    static int knight(boolean[][] board,int row){
        if (row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=knight(board,row+1);
                board[row][col]=false;
            }
        }
        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check upar right
        if(isValid(board,row-2,col+1)){
            if (board[row-2][col+1]){
                return false;
            }
        }

        //check upar left
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        //check one upar right
        if (isValid(board,row-1,col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }

        //check one upar left
        if (isValid(board,row-1,col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(row>=0 && row<= board.length-1 && col>=0 && col<= board.length-1 ){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] bool:board){
            for (boolean ele:bool){
                if(ele){
                    System.out.print("K ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
