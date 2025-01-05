package assignments;

import java.util.ArrayList;
import java.util.List;

public class strings {
    public static void main(String[] args) {
        String[] word1 = {};
        String[] word2 = {};
        System.out.println(concat(word1,word2));
    }
    static StringBuilder ipadress(String str){
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='.'){
                ans.append("[.]");
            }else{
                ans.append(str.charAt(i));
            }

        }
        return ans;
    }
//    static StringBuilder insertion(String str, int[] arr){
////        StringBuilder ans =new StringBuilder();
////        for (int i = 0; i < arr.length; i++) {
////            ans.insert(i,'a');
////        }
////        for (int i = 0; i < arr.length; i++) {
////            ans.insert(arr[i],str.charAt(i));
////        }
////        return ans;
//        char[] chars=str.toCharArray();
//        List<Character> characterList=new ArrayList<>();
//        for (char c : chars){
//            characterList.add(c);
//        }
//    }

    static StringBuilder interpret(String comm){
        StringBuilder stb = new StringBuilder();
//        List<Character>chars=new ArrayList<>();
//        char[] chars1=comm.toCharArray();
//        for(char c : chars1){
//            chars.add(c);
//        }
//        for (int i = 0; i < chars1.length ; i++) {
//            if (chars1[i] == 'G') {
//                stb.append('G');
//            }else if(chars1[i]==')' && chars1[i-1]=='(' ){
//                stb.append('o');
//            }else if (chars1[i]==')'&& chars1[i-1]=='l' && chars1[i-2]=='a'&& chars1[i-3]==')'){
//                stb.append("al");
//            }
//        }
        for (int i = 0; i < comm.length(); i++) {
            if (comm.charAt(i)=='G'){
                stb.append("G");
            }else if (comm.charAt(i)=='('){
                if (comm.charAt(i+1)==')'&& i+1<comm.length()){
                    stb.append("o");
                }else{
                    stb.append("al");
                }
            }
        }
        return stb;
    }
    static StringBuilder sentrnceSort(String str){
        StringBuilder ans = new StringBuilder(str.length());
        int a=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                for (int j = a; j <=i ; j++) {
                    ans.append(str.charAt(j));

                }
            }

        }
        return ans;
    }

    static Boolean concat(String[] word1,String[] word2 ){
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < word1[i].length(); j++) {
                s1.append(word1[i].charAt(j));
            }
        }
        for (int i = 0; i < word2.length; i++) {
            for (int j = 0; j < word2[i].length(); j++) {
                s2.append(word2[i].charAt(j));
            }
        }
        return s1.toString().equals(s2.toString());                            //STRING BUILDER KO STRING MEI CONVER KARNA HOGA FOR COMAPRING

    }
//    String concatWord1 = String.join("", word1);                             // VERY GOOD SHORTCUT TO CONCATINATE 2 STRINGS
//    String concatWord2 = String.join("", word2);
//        return concatWord1.equals(concatWord2);
}
