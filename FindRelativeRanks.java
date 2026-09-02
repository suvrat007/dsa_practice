package Grind75;

import java.util.Arrays;
import java.util.HashMap;

public class FindRelativeRanks {
//    public String[] findRelativeRanks(int[] score) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < score.length; i++) {
//            map.put(score[i],i);
//        }
//
//        Arrays.sort(score);
//
//        String[] ans = new String[score.length];
//        int rank = 1;
//
//        for (int i = score.length - 1; i >= 0; i--) {
//            int sc = score[i];
//            int idx = map.get(sc);
//
//
//            if (rank == 1) {
//                ans[idx] = "Gold Medal";
//            } else if (rank == 2) {
//                ans[idx] = "Silver Medal";
//            } else if (rank == 3) {
//                ans[idx] = "Bronze Medal";
//            } else {
//                ans[idx] = Integer.toString(rank);
//            }
//
//            rank++;
//
//        }
//
//        return ans;
//    }
    public String[] findRelativeRanks(int[] score) {
        int maxScore = 0;
        for (int i = 0; i < score.length; i++) {
            maxScore=Math.max(maxScore,score[i]);
        }

        int[] score2Idx= new int[maxScore+1];

        for (int i = 0; i < score.length; i++) {
            score2Idx[score[i]]=i+1;
        }

        String[] ans = new String[score.length];
        int rank = 1;

        for (int i = maxScore; i >= 0; i--) {
            if (score2Idx[i] == 0) continue;

            int idx = score2Idx[i] - 1;

            if (rank == 1) {
                ans[idx] = "Gold Medal";
            } else if (rank == 2) {
                ans[idx] = "Silver Medal";
            } else if (rank == 3) {
                ans[idx] = "Bronze Medal";
            } else {
                ans[idx] = Integer.toString(rank);
            }

            rank++;

        }

        return ans;
    }
}
