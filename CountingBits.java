package Grind75;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i] = oneCounts(i);
        }
        return ans;
    }
    private int oneCounts(int a){
        int ans=0;
        while(a>0){
            if (a%2==1) {
                ans++;
            }
            a/=2;
        }
        return ans;
    }
}
