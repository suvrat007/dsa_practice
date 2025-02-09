package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr2){
            map.put(num , 0);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                arr.add(arr1[i]);
            }
        }
        Integer[] arr3 = arr.toArray(new Integer[0]);
        Arrays.sort(arr3);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < map.get(arr2[i]); j++) {
                list.add(arr2[i]);
            }
        }
        if (arr3.length!=0){
            for (int i = 0; i < arr3.length; i++) {
                list.add(arr3[i]);
            }
        }
        int[] fin = new int[arr1.length];
        int i = 0;

        for(int num : list){
            fin[i++] = num;
        }
        return fin;
    }
}
