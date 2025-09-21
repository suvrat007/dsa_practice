package Grind75;

public class ZIgzagConversion {
    public String convert(String s, int numRows) {
        String[] ans = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i]="";
        }
        int i = 0;
        while(i<s.length()){
            for (int j = 0; i < s.length() && j<numRows; j++) {
                ans[j] += s.charAt(i++);
            }
            for (int j = numRows-2; j>0 && i < s.length(); j--) {
                ans[j] += s.charAt(i++);
            }
        }
        String res = "";
        for(String str : ans) {
            res+=str;
        }

        return res;
    }
}
