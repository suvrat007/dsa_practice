package Revision.RecursionRev;

public class MazeQuestions {
    public static void main(String[] args) {
        pathDia(3,3,"");
    }
    static void path(int row , int col, String p ){
        if (row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            path(row-1 , col , p+'V');
        }
        if (col>1){
            path(row,col-1,p+'H');
        }

    }

    static void pathDia(int row , int col, String p ){
        if (row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            pathDia(row-1 , col , p+'V');
        }
        if (col>1){
            pathDia(row,col-1,p+'H');
        }
        if(row>1 && col>1){
            pathDia(row-1 , col-1,p+'D');
        }

    }


}
