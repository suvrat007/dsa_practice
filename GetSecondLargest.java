package Grind75;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class GetSecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1;
        }

        Set<Integer> distinct = new HashSet<>();

        for (int num : arr) {
            distinct.add(num);
        }

        if (distinct.size() < 2) {
            return -1;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int num : distinct) {
            maxHeap.add(-num);
        }

        maxHeap.poll();

        if (maxHeap.isEmpty()) return -1;

        return -maxHeap.peek();

    }
}
