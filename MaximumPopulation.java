package Grind75;

import java.util.Arrays;

public class MaximumPopulation {
    public int maximumPopulation(int[][] logs) {
        int[] popYears = new int[100];

        for (int person = 0; person < logs.length; person++) {
            int birth = logs[person][0];
            int death = logs[person][1];

            for (int i = birth-1950; i < death-1950; i++) {   // AGE
                popYears[i]++;
            }
        }

        int max=popYears[0];
        int maxIdx=0;
        for (int i = 0; i < popYears.length; i++) {
            if (popYears[i]>max){
                max=popYears[i];
                maxIdx=i;
            }
        }

        return maxIdx+1950;
    }
}
