class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            res[i] = -1; // default if no greater element found
            for (int j = i+1; j < i+n; j++) {
                int idx = j % n; // circular indexing
                if (nums[idx] > nums[i]) {
                    res[i] = nums[idx];
                    break;
                }
            }
        }
        
        return res;
    }
}
