package Grind75;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j = 1; j < i; j++) {
                temp.add(prev.get(j-1)+prev.get(j));
            }

            if(i>0) temp.add(1);
            finalList.add(temp);
            prev = temp;
        }
        return finalList;
    }
}
