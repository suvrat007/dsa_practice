package Grind75;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (int i=0; i<ransomNote.length();i++){
            // if duplicate...incrememnt count
            if (ransomMap.containsKey(ransomNote.charAt(i))){
                ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i))+1);
            }else {
                // if new....add
                ransomMap.put(ransomNote.charAt(i), 1);
            }

        }
        for (int i=0; i<magazine.length();i++){
            // if duplicate...incrememnt count
            if (magazineMap.containsKey(magazine.charAt(i))){
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i))+1);
            }else{
                // if new....add
                magazineMap.put(magazine.charAt(i), 1);
            }

        }


        for (Character ch:ransomMap.keySet()){
            // check if ransom map not consist of same thing
            if (!magazineMap.containsKey(ch)){
                return false;
            }else{
                // check if value at key of magazineMap < value of same key in ransomMap....false
                if (magazineMap.get(ch) < ransomMap.get(ch)){
                    return false;
                }
            }

        }
        return true;
    }
}
