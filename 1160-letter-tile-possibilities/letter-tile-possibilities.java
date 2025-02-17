public class Solution {
    public int numTilePossibilities(String tiles) {
        int[] letterCount = new int[26];
        for (char c : tiles.toCharArray()) {
            letterCount[c - 'A']++;
        }
        return dfs(letterCount);
    }

    private int dfs(int[] letterCount) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (letterCount[i] == 0) {
                continue;
            }
            // Include this letter in the sequence
            count++;
            letterCount[i]--;
            // Explore further with this letter included
            count += dfs(letterCount);
            // Backtrack: restore the count for the next iteration
            letterCount[i]++;
        }
        return count;
    }
}
