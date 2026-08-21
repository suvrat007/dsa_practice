package Grind75;

public class MaxTurbulenceSize {
    public static void main(String[] args) {

    }
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }

        char[] sign= new char[arr.length];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                sign[i]='>';
            }else if (arr[i]<arr[i-1]){
                sign[i]='<';
            }else{
                sign[i]='=';
            }
        }

        int maxlen = 1;
        int start =1;

        for (int end = 0; end < arr.length; end++) {
            if (sign[end] == '=') {
                start = end + 1;
                continue;
            }

            if (end>start && sign[end] == sign[end-1]){
                start=end;
            }

            int currentLen= (end-start+1)+1;
            maxlen = Math.max(maxlen,currentLen);
        }

        return maxlen;
    }
}
