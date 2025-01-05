package Grind75;

public class powerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n/2!=0){
            return false;
        }
        if(n<=0){
            return false;
        }
        return isPowerOfTwo(n/2);

    }
}
