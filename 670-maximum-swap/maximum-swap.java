class Solution {
    public int maximumSwap(int num) {
        String nums = Integer.toString(num); // Fix: Convert num to string
        char[] arr = nums.toCharArray();     // Convert to char array to modify digits

        int max = -1;
        int maxIndex = -1;
        int swapFrom = -1;
        int swapTo = -1;

        // Find rightmost max digit and first digit smaller than max to swap
        for (int i = arr.length - 1; i >= 0; i--) {
            int currDigit = arr[i] - '0';
            if (currDigit > max) {
                max = currDigit;
                maxIndex = i;
            } else if (currDigit < max) {
                swapFrom = i;
                swapTo = maxIndex;
            }
        }

        // Do the swap if valid positions found
        if (swapFrom != -1) {
            char temp = arr[swapFrom];
            arr[swapFrom] = arr[swapTo];
            arr[swapTo] = temp;
        }

        return Integer.parseInt(new String(arr)); // Convert back to int
    }
}