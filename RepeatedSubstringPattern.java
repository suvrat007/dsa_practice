package Grind75;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n/2; len++) {
            // pattern length should divide n completely
            if (n%len != 0) {
                continue;
            }

            // take a pattern
            String pattern = s.substring(0,len);
            boolean ok = true;

            // check every pattern possible from there on
            for (int i = len; i < n; i+=len) {
                if (!s.substring(i,i+len).equals(pattern)){
                    ok=false;
                    break;
                }
            }

            if (ok) {
                return true;
            }
        }

        return false;
    }
}