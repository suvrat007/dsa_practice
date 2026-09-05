package Grind75;

import java.util.ArrayList;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
//    public static boolean rotateString(String s, String goal) {
//        if (s.length()!=goal.length()) return false;
//
//        if (s.equals(goal))return true;
//
//        ArrayList<Character> list= new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            list.add(s.charAt(i));
//        }
//
//        int iter=0;
//
//        while (iter<s.length()){
//            char ch = list.remove(0);
//            list.add(ch);
//            // checker
//
//            StringBuilder sb = new StringBuilder();
//            for(char c : list){
//                sb.append(c);
//            }
//
//            if (sb.toString().equals(goal)){
//                return true;
//            }
//
//            iter++;
//
//        }
//
//        return false;
//
//    }
    public static boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()) return false;
        int n = s.length();
        char firstcharingoal = goal.charAt(0);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)==firstcharingoal){
                int p1=0;
                int p2=i;
                while(p1<n && goal.charAt(p1%n)==s.charAt(p2%n)){
                    p1++;
                    p2++;
                }
                if (p1==n ) return true;
            }
        }
        return false;
    }

}
