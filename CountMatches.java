package Grind75;

import java.util.ArrayList;

public class CountMatches {
    public int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;


        if (ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }

        }if (ruleKey.equals("color")){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }

        }
        if (ruleKey.equals("name")){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }


        return ans;
    }
}
