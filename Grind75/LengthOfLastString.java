package Grind75;

public class LengthOfLastString {
    public static void main(String[] args) {
        String s = " world  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int total=0;
        int idx = 0;
        for (int i = s.length()-1; i>=0 ; i--){
            if (s.charAt(i)!=' '){
                idx= i;
                break;
            }
        }
        for (int i = idx; i >= 0; i--) {

            if (s.charAt(i)!=' '){
                ++total;
            }else {
                break;
            }
        }
        return total;
    }
}
