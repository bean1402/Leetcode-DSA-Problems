class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2; // Total number of (i, j) pairs
        long goodPairs = 0;

        for (int i = 0; i < n; ++i) {
            int x = i - nums[i];
            goodPairs += cnt.getOrDefault(x, 0); // Count good pairs
            cnt.put(x, cnt.getOrDefault(x, 0) + 1); // Update HashMap
        }

        return totalPairs - goodPairs; // Bad pairs = total pairs - good pairs
    }
}
