

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = findMax(candies); // Find the maximum candies among all kids

        for (int candy : candies) {
            // Check if the current kid can have the maximum candies or more
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    // Helper method to find the maximum value in the array
    private int findMax(int[] candies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}
