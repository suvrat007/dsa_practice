package Grind75;

public class ReverseInteger {
    public static int reverse(int x) {
        // try 1

//        int ans = 0 ;
//        int power = 0;
//        // for positive int
//        while(x>0){
//            int lastDigit = x%10;
//            ans+=Math.multiplyExact(lastDigit,power);
//            x/=10;
//            power++;
//        }
//
//        //for negative int

        // try 2

//        char[] num = Integer.toString(x).toCharArray();
//        int answer = 0;
//        int power = 0;
//        for (int i = 0; i <num.length; i++) {
//            if (num[i] == '-') {
//                continue;
//            }
//            answer += (num[i] - '0') * Math.pow(10, power);
//            power++;
//        }
//
//        return (num[0]=='-')? answer*-1:answer;

        // try 3
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0; // overflow case
        }
        return (int) reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
