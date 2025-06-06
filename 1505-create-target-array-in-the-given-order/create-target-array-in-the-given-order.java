class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // ArrayList<Integer> l= new ArrayList<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     l.add(index[i],nums[i]);
        // }
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=l.get(i);
        // }
        // return arr;

         int [] target = new int [index.length];

        for(int i =0; i<index.length; i++){

            for(int j =i; j>index[i]; j--){

                target[j] = target[j-1];
            }

            target[index[i]] = nums[i];
        }
        
        return target;

    }
}