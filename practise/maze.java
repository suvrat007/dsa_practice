package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    public static void main(String[] args) {
//        System.out.println(maze_LR_list("",3,3));
        boolean[][] restriction={
                {true,false,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[restriction.length][restriction[0].length];
        maze_All_Print("",0,0,restriction,1,path);
    }

    static void maze_LR(String p, int r,int c){                               // ONLY LEFT RIGHT MOVEMT
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            maze_LR(p+'D',r-1,c);
        }
        if (c>1){
            maze_LR(p+'R',r,c-1);
        }

    }
    static ArrayList<String> maze_LR_list(String p, int r, int c){                  // RESULT IN ARRAY
        ArrayList<String> arr=new ArrayList<>();
        if(r==1 && c==1){
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans=new ArrayList<>();
        if (r>1){
            ans.addAll(maze_LR_list(p+'D',r-1,c));
        }
        if (c>1){
            ans.addAll(maze_LR_list(p+'R',r,c-1));
        }
        return ans;
    }
    static void maze_LRD(String p, int r,int c){                                    //BOTTOM RIGHT AND DIAGONAL MVMNTS
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            maze_LRD(p+'B',r-1,c);
        }
        if (c>1){
            maze_LRD(p+'R',r,c-1);
        }
        if (r>1&&c>1){
            maze_LRD(p+'D',r-1,c-1);
        }

    }
    static void maze_LRD_restriction(String p, int r,int c,boolean rest[][]){                                    //BOTTOM RIGHT with resrtictions
        if(r==0 && c==0){
            System.out.println(p);
            return;
        }
        if(!rest[r][c]){
            return;
        }
        if (r>0){
            maze_LRD_restriction(p+'B',r-1,c,rest);
        }
        if (c>0){
            maze_LRD_restriction(p+'R',r,c-1,rest);
        }
        if (r>0&&c>0){
            maze_LRD_restriction(p+'D',r-1,c-1,rest);
        }

    }
    static void maze_AllD(String p, int r,int c, boolean [][] rest ){              //LEFT RIGHT DOWN UP AND BACKTRACK
        if(r== rest.length-1 && c== rest[0].length-1){
            System.out.println(p);
            return;
        }
        if(!rest[r][c]){
            return;
        }

        rest[r][c]=false;

        if (r< rest.length-1){
            maze_AllD(p+'B',r+1,c,rest);
        }
        if (c< rest[0].length-1){
            maze_AllD(p+'R',r,c+1,rest);
        }
        if (c>0){
            maze_AllD(p+'L',r,c-1,rest);
        }
        if (r>0){
            maze_AllD(p+'U',r-1,c,rest);
        }
        if (r< rest.length-1 && c < rest[0].length-1){
            maze_AllD(p+'D',r+1,c+1,rest);
        }

        rest[r][c]=true;

    }

    static void maze_All_Print(String p, int r, int c, boolean[][] rest, int step,int[][] path){
        if(r== rest.length-1 && c== rest[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!rest[r][c]){
            return;
        }

        rest[r][c]=false;
        path[r][c]=step;

        if (r< rest.length-1){
            maze_All_Print(p+'B',r+1,c,rest,step+1,path);
        }
        if (c< rest[0].length-1){
            maze_All_Print(p+'R',r,c+1,rest,step+1,path);
        }
        if (c>0){
            maze_All_Print(p+'L',r,c-1,rest,step+1,path);
        }
        if (r>0){
            maze_All_Print(p+'U',r-1,c,rest,step+1,path);
        }
        if (r< rest.length-1 && c < rest[0].length-1){
            maze_All_Print(p+'D',r+1,c+1,rest,step+1,path);
        }

        rest[r][c]=true;
        path[r][c]=0;
    }


}
