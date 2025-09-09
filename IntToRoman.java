package Grind75;

import java.util.HashMap;

public class IntToRoman {
    public String intToRoman(int num) {
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i =0;
        StringBuilder str = new StringBuilder();

        while (num>0 && i<arr.length){
            int quotient = num/arr[i];
            int reminder = num%arr[i];
            if (quotient>0){
                for (int j = 0; j < quotient; j++) {
                    str.append(getString(arr[i]));
                }
                num=reminder;
                i++;
            }else{
                i++;
            }
        }
        return str.toString();
    }

    private String getString(int num){
        if (num==1000){
            return "M";
        } else if (num==900) {
            return "CM";
        } else if (num==500) {
            return "D";
        } else if (num==400) {
            return "CD";
        } else if (num==100) {
            return "C";
        } else if (num==90){
            return "XC";
        } else if (num==50) {
            return "L";
        } else if (num==40) {
            return "XL";
        } else if (num==10){
            return "X";
        } else if (num==9) {
            return "IX";
        } else if (num==5) {
            return "V";
        } else if (num==4){
            return "IV";
        }else{
            return "I";
        }
    }
}
