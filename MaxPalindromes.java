package Grind75;

public class MaxPalindromes {
    public int maxPalindromes(String s, int k) {
        char[] sc = s.toCharArray();
        int count = 0;
        int i = 0;
        int n = sc.length;

        while(i<=n-k){
            boolean found = false;
            for (int len = k; len <= k+1 && i+len<=n ; len++) {
                int left = i;
                int right = left+len-1;

                if (isPalindrome(left, right,sc)){
                    count++;
                    i+=len;
                    found=true;
                    break;
                }
            }
            if(!found){
                i++;
            }
        }

        return count;


    }

    private boolean isPalindrome (int left, int right, char[] s){
        while(left<right){
            if (s[left]!=s[right]){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }


}
