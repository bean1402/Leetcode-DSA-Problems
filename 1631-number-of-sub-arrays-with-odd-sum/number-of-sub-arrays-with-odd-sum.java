public class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int oddCount = 0;
        int evenCount = 1; // To account for sub-arrays starting with the current element
        int result = 0;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum % 2 == 0) {
                result = (result + oddCount) % MOD;
                evenCount++;
            } else {
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }

        return result;
    }
}
