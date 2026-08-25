package Grind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class Trap {
    public int trap(int[] height) {
        int n = height.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int water =0;

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
                int bottom = stack.pop();
                if (stack.isEmpty()) break;

                int left = stack.peek();
                int leftH = height[left];
                int rightH = height[i];
                int boundedH = Math.min(leftH, rightH) - height[bottom];
                int width = i - left -1;

                water+=boundedH*width;
            }
            stack.push(i);
        }
        return water;
    }
}
