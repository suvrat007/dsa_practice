package Grind75;

public class ReduceNumToZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return numberOfSteps(0 ,  num);

    }

    private static int numberOfSteps(int steps, int num) {
        if (num == 0){
            return steps;
        }else if (num%2==0) {
            return numberOfSteps(steps+1 , num/2);
        }else {
            return numberOfSteps(steps+1 , num-1);
        }
    }
}
