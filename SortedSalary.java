package Grind75;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortedSalary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0 ;
        for(int i =1; i<salary.length-1 ; i++){
            sum+=salary[i];
        }

        return sum/(salary.length-2);

    }
}
