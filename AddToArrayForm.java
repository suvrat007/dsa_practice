package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddToArrayForm {
    public ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        int n =0;
        for (int i = num.length-1; i >= 0 ; i--) {
            int sum = num[i] + k;
            list.add(sum%10);
            k= sum/10;
        }

        while(k>0){
            list.add(k%10);
            k/=10;
        }

        Collections.reverse(list);
        return list;
    }
}
