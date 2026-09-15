package Grind75;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length()) return false;

        int i = -1;
        int j = -1;

        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k)!=goal.charAt(k)){
                if (i == -1) {
                    i = k;
                }else if (j == -1) {
                    j = k;
                } else {
                   return false;
                }
            }
        }

        if (i == -1 && j == -1) {
            int[] freq = new int[26];
            for (int k = 0; k < s.length(); k++) {
                freq[s.charAt(k) - 'a']++;
                if (freq[s.charAt(k) - 'a'] >= 2) {
                    return true;
                }
            }
            return false;
        }

        if (i != -1 && j != -1) {
            return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
        }

        return false;
    }
}
