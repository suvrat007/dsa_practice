package Grind75;

public class AddDigits {
    public int addDigits(int num) {

        while(num>=10){
            num = adder(num);
        }

        return num;

    }
    private int adder(int num){
        int total = 0;
        while(num>0){
            int digit = num%10;
            total+=digit;
            num=num/10;
        }
        return total;
    }
}
