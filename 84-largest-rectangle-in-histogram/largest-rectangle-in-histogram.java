import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = leftNearest(heights, n);
        int[] right = rightNearest(heights, n);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currArea = heights[i] * width;
            ans = Math.max(ans, currArea);
        }
        return ans;
    }

    // nearest smaller to left
    private int[] leftNearest(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }

    // nearest smaller to right
    private int[] rightNearest(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return right;
    }
}
