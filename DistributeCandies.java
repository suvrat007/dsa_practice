package Grind75;

import java.util.HashSet;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] arr = {6,6,6,6};
        System.out.println(distributeCandies(arr));
    }
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}
