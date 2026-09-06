package Grind75;

import java.util.*;

public class WordBreak {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        HashMap<Character, List<Integer>> map = new HashMap<>();
//
//        for (int i = 0; i < wordDict.size(); i++) {
//            String w = wordDict.get(i);
//            if (w.isEmpty()) continue;
//            char c = w.charAt(0);
//            if (!map.containsKey(c)) {
//                map.put(c, new ArrayList<>());
//            }
//            map.get(c).add(i);
//        }
//
//        Boolean[] memo = new Boolean[s.length() + 1];
//        return solve(0, s, wordDict, map, memo);
//    }
//
//    private boolean solve(int start, String s, List<String> wordDict,
//                          HashMap<Character, List<Integer>> map, Boolean[] memo) {
//        if (start == s.length()) {
//            return true;
//        }
//        if (memo[start] != null) {
//            return memo[start];
//        }
//
//        char c = s.charAt(start);
//        if (!map.containsKey(c)) {
//            memo[start] = false;
//            return false;
//        }
//
//        List<Integer> idxList = map.get(c);
//
//        for (int k = 0; k < idxList.size(); k++) {
//            int id = idxList.get(k);
//            String word = wordDict.get(id);
//
//            if (start + word.length() > s.length()) {
//                continue;
//            }
//
//            boolean match = true;
//            for (int j = 0; j < word.length(); j++) {
//                if (s.charAt(start + j) != word.charAt(j)) {
//                    match = false;
//                    break;
//                }
//            }
//
//            if (match) {
//                if (solve(start + word.length(), s, wordDict, map, memo)) {
//                    memo[start] = true;
//                    return true;
//                }
//            }
//        }
//
//        memo[start] = false;
//        return false;
//    }

    public boolean wordBreak(String s, List<String> wordDict){
        Set<String> dict = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0]=true;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[n];

    }
}
