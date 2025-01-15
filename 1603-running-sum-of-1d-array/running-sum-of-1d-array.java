class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0]; // Initialize the first element
        
        // Start the loop from the second element
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        
        return ans;
    }
}
