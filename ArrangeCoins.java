package Grind75;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }
    public static int arrangeCoins(int n) {
        int count = 0;
        int i = 1;

        while(n>=i){
            n-=i;
            count++;
            i++;
        }
        return count;
    }
}
