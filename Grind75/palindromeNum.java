package Grind75;

public class palindromeNum {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int org = x;
        while(x>0){
            ans= ans*10 + (x%10);
            x=x/10;
        }
        return ans==org;
    }
}
