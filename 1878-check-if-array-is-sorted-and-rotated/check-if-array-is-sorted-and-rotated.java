class Solution {
    public boolean check(int[] nums) {

        //Approach
//1 Traverse through the array.
//2Compare each element with the next one (using modulo to wrap around from the last element to the first).
//3 Count how many times the current element is greater than the next.
//4 If this happens more than once, return False.
//5 Otherwise, return True.
//6 This ensures we check both the linear order and the circular (rotated) case.

    int n = nums.length;
    int count = 0;

    for(int i=0; i<n; i++){
        if(nums[i] > nums[(i+1) % n]) {
            count++;
        }
    }

    if(count > 1) return false;
    else return true;


        
    }
}