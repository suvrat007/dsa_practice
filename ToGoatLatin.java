package Grind75;

import java.util.Arrays;
import java.util.HashSet;

public class ToGoatLatin {
//    public String toGoatLatin(String sentence) {
//        String[] str = sentence.split(" ");
//
//
//        for (int i = 0; i < str.length; i++) {
//            String word = str[i];
//            if (!isConsonentOrVowel(word)){
//                word = word + "ma";
//            } else {
//                String first = word.substring(0, 1);
//                String rest = word.substring(1);
//                word = rest + first + "ma";
//            }
//
//            StringBuilder sb = new StringBuilder(word);
//            for (int k = 0; k <= i; k++) {
//                sb.append('a');
//            }
//            str[i] = sb.toString();
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < str.length; i++) {
//            if (i > 0) result.append(' ');
//            result.append(str[i]);
//        }
//
//        return  result.toString();
//
//    }

//    public boolean isConsonentOrVowel(String str){
//        char ch=Character.toLowerCase(str.charAt(0));
//        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//    }

    public String toGoatLatin(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);

            if (isConsonentOrVowel(words[i])){
                sb.append(word);
            } else {
                sb.append(word.substring(1)).append(first);
            }

            sb.append("ma");

            for (int j = 0; j <=i; j++) {
                sb.append('a');
            }

            if (i<words.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();


    }
    public boolean isConsonentOrVowel(String str){
        char ch=Character.toLowerCase(str.charAt(0));
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
