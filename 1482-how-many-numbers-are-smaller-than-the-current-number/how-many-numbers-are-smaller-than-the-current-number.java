class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int n = nums.length;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}
