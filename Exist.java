package Grind75;

public class Exist {
    public boolean exist(char[][] board, String word) {
        int rowLen = board.length;
        int colLen = board[0].length;

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (search(board,word,row,col,0)){
                    return true;
                }
            }
        }

        return false;

    }

    public boolean search (char[][] board, String word, int r, int c, int idx){
        if (idx==word.length()){
            return true;
        }

        if(r<0 || c<0 || r>= board.length || c>= board[0].length || board[r][c]!=word.charAt(idx)){
            return false;
        }

        char or = board[r][c];
        board[r][c] = '#';

        boolean found = search(board,word,r,c+1,idx+1)
                || search(board,word,r+1,c,idx+1)
                || search(board,word,r-1,c,idx+1)
                || search(board,word,r,c-1,idx+1);


        board[r][c]= or;
        return found;
    }

}
