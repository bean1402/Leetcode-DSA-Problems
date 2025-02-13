import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, int[]> digitSumMap = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sum = getDigitSum(num);
            int[] maxPair = digitSumMap.getOrDefault(sum, new int[]{-1, -1});

            if (maxPair[0] == -1) {
                maxPair[0] = num;
            } else if (num > maxPair[0]) {
                maxPair[1] = maxPair[0];
                maxPair[0] = num;
            } else if (maxPair[1] == -1 || num > maxPair[1]) {
                maxPair[1] = num;
            }

            digitSumMap.put(sum, maxPair);
        }

        for (int[] pair : digitSumMap.values()) {
            if (pair[0] != -1 && pair[1] != -1) {
                maxSum = Math.max(maxSum, pair[0] + pair[1]);
            }
        }

        return maxSum;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
