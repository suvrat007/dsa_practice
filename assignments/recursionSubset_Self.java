package assignments;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class recursionSubset_Self {
    public static void main(String[] args) {
//        System.out.println(skip_apple("bacapplecadah"));
//        System.out.println(prmtations_arrlist("","abc"));
        dice("",4);    }


// 1. SKIP

    static void skip_a(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch=='a'){
            skip_a(p,up.substring(1));
        }else{
            skip_a(p+ch,up.substring(1));
        }

    }

    static String skip_apple(String up){
        if(up.isEmpty()){
            return "";
        }


        if (up.startsWith("apple")){
            return skip_apple(up.substring(5));
        }else{
            return up.charAt(0)+skip_apple(up.substring(1));
        }

    }
    static int prmtations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return 1;
        }
        int count =0;

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            count=count +prmtations(p.substring(0,i)+ch+p.substring(i,p.length()),up.substring(1));
        }
        return count;
    }
    static void cnt(int n){
        System.out.println(n);
    }

    static ArrayList<String> prmtations_arrlist(String p ,String up){

        ArrayList<String> arr=new ArrayList<>();
        if (up.isEmpty()){
            arr.add(p);
            return arr;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();

        for (int i = 0; i <= p.length() ; i++) {
            ans.addAll(prmtations_arrlist(p.substring(0,i)+ch+p.substring(i,p.length()),up.substring(1)));
        }
        return ans;
    }
    static void nokia(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int ch= up.charAt(0) - '0';          // CONVERTS '2' TO 2

        if (ch>=2 && ch<=6){
            for (int i = 3*(ch-2); i < 3*(ch-1); i++) {

                nokia(p+(char)('a'+i),up.substring(1));
            }
        }else if (ch==7){
            for (int i = 15; i < 19; i++) {
                nokia(p+(char)('a'+i),up.substring(1));
            }
        } else if (ch==8) {
            for (int i = 19; i < 22; i++) {
                nokia(p+(char)('a'+i),up.substring(1));

            }
        } else if (ch==9) {
            for (int i = 22; i < 26; i++) {
                nokia(p +(char) ('a' + i), up.substring(1));

            }
        } else {
            nokia(p + '0', up.substring(1));
        }




    }

    static ArrayList<String> nokia_list(String p , String up){
        ArrayList<String> arr=new ArrayList<>();
        if (up.isEmpty()){
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans = new ArrayList<>();
        int ch= up.charAt(0) - '0';          // CONVERTS '2' TO 2

        if (ch>=2 && ch<=6){
            for (int i = 3*(ch-2); i < 3*(ch-1); i++) {

                ans.addAll(nokia_list(p+(char)('a'+i),up.substring(1)));
            }
        }else if (ch==7){
            for (int i = 15; i < 19; i++) {
                ans.addAll(nokia_list(p+(char)('a'+i),up.substring(1)));
            }
        } else if (ch==8) {
            for (int i = 19; i < 22; i++) {
                ans.addAll(nokia_list(p+(char)('a'+i),up.substring(1)));

            }
        } else if (ch==9) {
            for (int i = 22; i < 26; i++) {
                ans.addAll(nokia_list(p +(char) ('a' + i), up.substring(1)));

            }
        } else {
            ans.addAll(nokia_list(p + '0', up.substring(1)));
        }
        return ans;

    }

    static void dice(String p, int tgt){
        if (tgt==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=tgt; i++) {
            dice(p+i,tgt-i);
        }
    }


}
