package Grind75;

public class ReverseDegree {
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }
    public static int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = '{'-s.charAt(i);
            sum = sum + ((i+1)*num);
        }

        return sum;
    }
}
