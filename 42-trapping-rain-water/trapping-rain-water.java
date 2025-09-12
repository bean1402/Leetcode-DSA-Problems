class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(leftMax>height[l]){
                    total += leftMax-height[l];
                }
                else{
                    leftMax=height[l];
                    
                }
                l = l+1;
            }
            else{
                if(rightMax > height[r]){
                    total += rightMax-height[r];
                }
                else{
                    rightMax = height[r];
                   
                }
                 r = r-1;
            }

        }
        return total;
    }
}