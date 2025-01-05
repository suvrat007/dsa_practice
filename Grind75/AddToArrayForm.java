package Grind75;

import java.util.ArrayList;

public class AddToArrayForm {
    public ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n=n*10 + num[i];
        }

        int sum = n+k;

        if (sum==0){
            list.add(0);
        }

        while(sum>0){
            list.add(0,sum%10);
            sum/=10;
        }
        return list;
    }
}
