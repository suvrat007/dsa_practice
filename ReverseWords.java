package Grind75;

import java.util.ArrayList;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        ArrayList<StringBuilder> words = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for (int i = s.length()-1; i>=0 ; i--) {
            if (s.charAt(i)!=' '){
                str.append(s.charAt(i));
            }else{
                str.reverse();
                if (str.length() !=0){
                    words.add(new StringBuilder(str));
                }
                str.setLength(0);
            }
        }
        str.reverse();
        if (str.length() != 0) {
            words.add(new StringBuilder(str));
        }

//        System.out.println(words);

        StringBuilder finalSentence = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
                        if (i==words.size()-1){
                finalSentence.append(words.get(i));
            }else{
                finalSentence.append(words.get(i) + " ");
            }
        }
        return finalSentence.toString();
    }
}
