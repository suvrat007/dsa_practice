package Grind75;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if (s.length()!=t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            // s ka character is already mapped
            if (map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else{
                //check if t ka character is mapped
                for(Map.Entry<Character,Character> entry : map.entrySet() ){
                    if (entry.getValue()==t.charAt(i)){
                        return false;
                    }
                }
                map.put(s.charAt(i),t.charAt(i));
            }

        }

        return true;
    }
}
