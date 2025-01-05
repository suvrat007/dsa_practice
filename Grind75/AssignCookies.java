package Grind75;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2, 3};
        int[] s = {3};

        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
//        int count = 0;
//        for (int i = 0; i < g.length; i++) {
//            for (int j = 0; j < s.length; j++) {
//                if (s[j] >= g[i]){
//                    count++;
//                    s[j]= -1;
//                    break;
//                }
//            }
//
//
//        }
//        return count;



        // give each child cookie according to greed...so first sort

        Arrays.sort(g);
        Arrays.sort(s);

        int i=0, j=0 , count =0;

        while (i<g.length && j< s.length){
            if (s[j]>=g[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return count;

    }
}
