package Grind75;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        int n =heights.length;
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i==n) ? 0 : heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > h){
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea,height*width);
            }

            stack.push(i) ;
        }

        return maxArea;
    }
}
