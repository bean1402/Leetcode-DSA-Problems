public class Solution {
    public int punishmentNumber(int n) {
        int totalPunishment = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartitionToSum(String.valueOf(square), 0, i)) {
                totalPunishment += square;
            }
        }
        return totalPunishment;
    }

    private boolean canPartitionToSum(String numStr, int start, int target) {
        if (start == numStr.length()) {
            return target == 0;
        }
        int currentNumber = 0;
        for (int j = start; j < numStr.length(); j++) {
            currentNumber = currentNumber * 10 + (numStr.charAt(j) - '0');
            if (currentNumber > target) {
                break;
            }
            if (canPartitionToSum(numStr, j + 1, target - currentNumber)) {
                return true;
            }
        }
        return false;
    }
}
