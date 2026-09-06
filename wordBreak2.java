package Grind75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);

        solve(s, ans, dict, 0, new ArrayList<>());

        return ans;

    }
    
    public static void solve(String s , List<String> list , Set<String> words, int i , List<String> path){
        if (i == s.length()) {
            list.add(String.join(" ", path));
            return;
        }

        for (int j = i+1; j <= s.length(); j++) {
            String str = s.substring(i,j);
            if (words.contains(str)){
                path.add(str);
                solve(s,list,words,j,path);
                path.remove(path.size() - 1);

            }
        }

    }
}
