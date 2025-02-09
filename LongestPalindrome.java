package Grind75;

import java.util.ArrayList;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("d"));
    }
//    public static int longestPalindrome(String s) {
////        ArrayList<Character> list = new ArrayList<>();
//
//        Character[] list = new Character[s.length()];
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            list[i]=' ';
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < list.length; j++) {
//                if (list[j] !=s.charAt(i)){
//                    list[j]=(s.charAt(i));
//                }else{
//                    list[j]=' ';
//                    count+=2;
//                }
//            }
//        }
//
//        int dig = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (list[i]==' '){
//                dig++;
//            }
//        }
//
//        if (dig!=s.length()){
//            return (int) Math.sqrt(count)+1;
//        }
//
//        return (int) Math.sqrt(count);
//    }



    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char ch : s.toCharArray()){
            count[ch]++;
        }
        int res = 0;
        for (int i = 0; i < 128; i++) {
            int val = count[i];
            res = res + (val/2)*2;
            if (res%2==0 && val%2==1){
                res++;
            }
        }
        return res;
    }

}
