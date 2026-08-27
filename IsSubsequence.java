package Grind75;

import java.util.concurrent.LinkedTransferQueue;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sTrack = 0;
        int tTrack =0 ;

        if (s.length() == 0) return true;

        while(tTrack<t.length()){
            if (sTrack>=s.length()) return true;

            char tchar = t.charAt(tTrack);
            char schar = s.charAt(sTrack);

            if (tchar==schar ){
                sTrack++;
            }
            tTrack++;

        }

        return sTrack==s.length();
    }
}
