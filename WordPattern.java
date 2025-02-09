package Grind75;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] sArray = s.split(" ");
        if (pattern.length()!=sArray.length){
            return false;
        }
        for (int i = 0; i < sArray.length; i++) {
            //check if key is present
            if (map.containsKey(pattern.charAt(i))){
                //if key is present and value is different....return false
                if (map.get(pattern.charAt(i)).equals(sArray[i])){
                    return false;
                }
            }else{
                if (map.containsValue(sArray[i])) {
                    return false;
                }
                map.put(pattern.charAt(i),sArray[i]);
            }


        }
        return true;
    }
}
