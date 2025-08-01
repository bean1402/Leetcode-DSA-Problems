class Solution {
    public int[] searchRange(int[] nums, int target) {
       return firstAndLastPosition(nums,target);
         
    }
    static int firstOccurance(int[] nums,  int target){
            int low=0,high=nums.length-1;
            int first=-1;
            while(low<=high){
                int mid = low + (high-low)/2;

                if(nums[mid] == target){
                    first = mid;
                    high = mid-1;
                } else if(nums[mid]<target){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            return first;
        }

          static int lastOccurance(int[] nums,  int target){
            int low=0,high=nums.length-1;
            int last=-1;
            while(low<=high){
                int mid = low + (high-low)/2;

                if(nums[mid] == target){
                    last = mid;
                    low = mid + 1;
                } else if(nums[mid]<target){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
                

            }
            return last;
          }
            

            static int[] firstAndLastPosition(int[] nums, int target){
                int first = firstOccurance(nums,target);
                if(first==-1) return new int[]{-1,-1};

                int last = lastOccurance(nums,target);
                return new int[]{first,last};
            }
}
