package Grind75;

import com.sun.jdi.CharType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        // splitted both senteces on spaces
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        // added the splitted sentence to one arraylist
        ArrayList<String> all = new ArrayList<>();
        all.addAll(Arrays.asList(arr1));
        all.addAll(Arrays.asList(arr2));

        // sorted the arraylist
        Collections.sort(all); // collections provides bhot si functionalities....like sorting of arraylists

        ArrayList<String> result = new ArrayList<>();
        int i = 0;

        // check baju wala element if same or not....if not then all in result arraylist
        while(i < all.size()){
            boolean check = true;
            if (i+1 < all.size() && all.get(i).equals(all.get(i+1))){
                check=false;
                i++;
            }else if(i<all.size()-1 && all.get(i).equals(all.get(i-1))){
                check=false;
                i++;
            }
            if (check){
                result.add(all.get(i));
            }
            i++;
        }
        return result.toArray(new String[0]);

    }
}
