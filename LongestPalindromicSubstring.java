package Grind75;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        int start =0 , maxLength=1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len2,len1);
            if (len>maxLength){
                maxLength=len;
                start = i - (len-1)/2;
            }
        }

        return s.substring(start,start+maxLength);
    }

    private int expand (String s, int l, int r ){
        while(l>=0 && r< s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
