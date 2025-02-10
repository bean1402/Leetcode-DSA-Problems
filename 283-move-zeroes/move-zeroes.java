class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i < nums.length; i++){
            for (int j = i + 1; j<nums.length; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    swap(nums,i,j);
                }
            }
        }
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}