package assignments;

import java.util.*;


public class math {
    public static void main(String[] args) {
        String s="IX";
        System.out.println(romanToInt(s));
//        int n=4;
//        System.out.println('AA'-'A');
    }
    static int romanToInt(String num){
        int sum=0;
        Character[] roman={'I','V','X','L','C','D','M'};
        int[] val={1,5,10,50,100,500,1000};
        int [] savedval= new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            char romanCh=num.charAt(i);
            savedval[i]=val[binary(0,roman.length-1,roman,romanCh)];
        }
        for (int i = 1; i <= savedval.length; i++) {
            if(i== savedval.length){
                sum+=savedval[i-1];
                break;
            }
            if (savedval[i-1]<savedval[i]){
                sum-=savedval[i-1];
            }else{
                sum+=savedval[i-1];
            }
        }
        return sum;
    }
    static int binary(int start, int end, Character[] array, char tgt){
        while (start<=end){
            int mid= start+(end-start)/2;
            if (array[mid]==tgt) {
                return mid;
            } else if (array[mid]<tgt) {
                start=mid +1;
            }else{
                end=mid-1;
            }

        }
        System.out.println("wrong roman "+ tgt);
        return -1;

    }
//    static int romanToInt_betterone(String num) {                                       // BETTER CODE AND APPROACH
//        int[] values = new int[26]; // Assuming only uppercase Roman numerals
//        values['I' - 'A'] = 1;
//        values['V' - 'A'] = 5;
//        values['X' - 'A'] = 10;
//        values['L' - 'A'] = 50;
//        values['C' - 'A'] = 100;
//        values['D' - 'A'] = 500;
//        values['M' - 'A'] = 1000;
//
//        int sum = 0;
//        int prevValue = 0;
//
//        for (int i = num.length() - 1; i >= 0; i--) {
//            int value = values[num.charAt(i) - 'A'];
//            if (value < prevValue) {
//                sum -= value;
//            } else {
//                sum += value;
//            }
//            prevValue = value;
//        }
//        return sum;
//    }
//    static int romanToInt_bettercode(String num) {                                 // BETTER CODE
//        int[] val = {1, 5, 10, 50, 100, 500, 1000};
//        int sum = 0;
//        int prevValue = 0;
//
//        for (int i = num.length() - 1; i >= 0; i--) {
//            char romanCh = num.charAt(i);
//            int index = indexOf(romanCh);
//            if (val[index] < prevValue) {
//                sum -= val[index];
//            } else {
//                sum += val[index];
//            }
//            prevValue = val[index];
//        }
//
//        return sum;
//    }
//
//    static int indexOf(char romanCh) {
//        switch (romanCh) {
//            case 'I': return 0;
//            case 'V': return 1;
//            case 'X': return 2;
//            case 'L': return 3;
//            case 'C': return 4;
//            case 'D': return 5;
//            case 'M': return 6;
//            default: throw new IllegalArgumentException("Invalid Roman numeral character: " + romanCh);
//        }
//    }
//}
   static boolean happyNum(int num){
       int tgt=sum(0,num);
       if (tgt/10<10){
           if(tgt==1){
               return true;
           }
       }else{
           happyNum(tgt);
       }
       return false;
   }
   static int sum(int ans,int num){

        if (num==0){
            return ans ;
        }
        return sum(ans=((num%10)*(num%10)),num/10);


   }

   static String armstrong(int num){
        if (cube(0,num)==num){
            return "yes";
        }
        return "no";
   }
   static int cube(int ans, int num){
        if (num==0){
            return ans;
        }
        return cube(ans+=((num%10)*(num%10)*(num%10)),num/10);
    }

    static boolean powOf4(float num){
        if(quad(num)==4.0){
            return true;
        }
        return false;
    }
    static float quad(float num){
        if (num>0 && num<10){
            return num;
        }
        return quad(num/4);
    }
    static int factorial(int num){
        int sum=1;
        while(num>=1){
            sum=sum*num;
            num--;
        }
        return sum;
    }
//    static String excel(int num){
//        int[] reference=new int[(int) (Math.pow(2,31)-1)];
//    }



}

