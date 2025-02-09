package Grind75;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "a", t = "ab";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
//        int god=0;
//        boolean checker=false;
//        if(s.length()!=t.length()){
//            return false;
//        }
//        int sumS=0;
//        int sumT=0;
//        if(s.length()!=t.length()){
//            return false;
//        }else{
//            god++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            sumS+=s.charAt(i);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            sumT+=t.charAt(i);
//        }
//        if (sumT!=sumS){
//            return false;
//        }else{
//            god++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch = t.charAt(i);
//            checker=false;
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(j)==ch){
//                    checker=true;
//                    break;
//                }
//            }
//            if (!checker){
//                return false;
//            }else {
//                god++;
//            }
//        }
//        if (god!=3){
//            return false;
//        }
//        return true;
        char[] arrS=s.toCharArray();
        char[] arrT=t.toCharArray();
        if (arrT.length!=arrS.length){
            return false;
        }
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS,arrT);


    }

}
