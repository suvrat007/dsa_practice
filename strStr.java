package Grind75;

public class strStr {
    public static void main(String[] args) {
        System.out.println(Str("leetcode","leeto"));
    }
    public static int Str(String haystack, String needle) {
        if(needle.length()==0) return -1;

        String[] arr = haystack.split(needle,2);

        if (arr.length==1){
            return -1;
        }

        return arr[0].length();
    }
}
