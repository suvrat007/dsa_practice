package Grind75;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] need = new int[26];
        int[] have = new int[26];

        need['b' - 'a'] = 1;
        need['a' - 'a'] = 1;
        need['l' - 'a'] = 2;
        need['o' - 'a'] = 2;
        need['n' - 'a'] = 1;

        for (int i = 0; i < text.length(); i++) {
            have[text.charAt(i) - 'a']++;
        }

        int ans = Integer.MAX_VALUE;

        char[] letters = {'b', 'a', 'l', 'o', 'n'};
        for (char c : letters) {
            int idx = c - 'a';
            ans = Math.min(ans, have[idx] / need[idx]);
        }

        return ans;
    }
}
