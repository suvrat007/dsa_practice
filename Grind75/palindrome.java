package Grind75;

import java.util.ArrayList;
import java.util.*;


public class palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

//        for (int i = 0; i < s.length(); i++) {
//            char ch= s.charAt(i);
//            if (Character.isLetter(ch)){
//                for (int j = s.length()-1-i; j >=i; j--) {
//                    char opSideChar=s.charAt(j);
//                    if (Character.isLetter(opSideChar)){
//                        if (Character.toLowerCase(ch)!=Character.toLowerCase(opSideChar)){
//                            return false;
//                        }else {
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        int i = 0, j =s.length()-1;
//        while(i <= j ){
//            char ch= s.charAt(i);
//            char ch2= s.charAt(s.length()-1-i);
//            if (Character.isLetter(ch) && Character.isLetter(ch2)){
//                if (Character.toLowerCase(ch) != Character.toLowerCase(ch2)) {
//                    return false;
//                }
//            }else{
//                if (!Character.isLetter(ch)){
//                    i++;
//                }
//                if (!Character.isLetter(ch2)){
//                    j--;
//                }
//            }
////            if (Character.isLetter(ch) && Character.isLetter(ch2)) {
////                i++;
////                j--;
////            }
//            i++;
//            j--;
//
//        }
//        return true;


        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters on the left side
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters on the right side
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Convert characters to lowercase for comparison
            char ch1 = Character.toLowerCase(s.charAt(left));
            char ch2 = Character.toLowerCase(s.charAt(right));

            // Check if characters are equal
            if (ch1 != ch2) {
                return false;
            }

            left++; // Increment left only when characters match
            right--;
        }

        // If loop completes, all characters match and it's a palindrome
        return true;

    }
}
