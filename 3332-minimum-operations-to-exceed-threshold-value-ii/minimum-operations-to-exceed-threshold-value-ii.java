import java.util.PriorityQueue;

public class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        int operations = 0;

        // Insert all elements into the min-heap
        for (int num : nums) {
            minHeap.offer((long) num);
        }

        // Perform operations until the smallest element is >= k or not enough elements
        while (minHeap.size() > 1 && minHeap.peek() < k) {
            long x = minHeap.poll();
            long y = minHeap.poll();
            long newElement = 2 * Math.min(x, y) + Math.max(x, y);
            minHeap.offer(newElement);
            operations++;
        }

        // Check if the smallest element is now >= k
        return minHeap.peek() >= k ? operations : -1;
    }
}
