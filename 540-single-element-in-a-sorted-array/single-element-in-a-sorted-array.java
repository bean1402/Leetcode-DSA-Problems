class Solution {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length == 1) return nums[0];
        //For first element 
        if(nums[0] != nums[1]) return nums[0];

        //For last element
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];

        int start=0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];


            //We are in left
            if(mid % 2 == 1 && nums[mid] == nums[mid-1] || mid%2==0 && nums[mid] == nums[mid+1]){
                start = mid+1;
            } 
            
            
            // we are in right
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}