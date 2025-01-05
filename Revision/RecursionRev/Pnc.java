package Revision.RecursionRev;

import java.util.ArrayList;
import java.util.Arrays;

public class Pnc {
    public static void main(String[] args) {
        System.out.println(subSeq("", "abc"));
    }
    static ArrayList<String> subSeq(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> non = subSeq(p+ch, up.substring(1));
        ArrayList<String> incl =subSeq(p , up.substring(1));

        non.addAll(incl);
        return non;
    }
//    static String permutations(String p , String up){
//        if (up.isEmpty()){
//            return p;
//        }
//
//    }
}
