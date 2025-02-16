public class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] ans = new int[2 * n - 1];
        dfs(n, 0, 0, ans);
        return ans;
    }

    private boolean dfs(int n, int index, int mask, int[] ans) {
        if (index == ans.length)
            return true;
        if (ans[index] != 0)
            return dfs(n, index + 1, mask, ans);

        for (int num = n; num >= 1; num--) {
            if ((mask & (1 << num)) != 0)
                continue;
            if (num == 1) {
                ans[index] = num;
                if (dfs(n, index + 1, mask | (1 << num), ans))
                    return true;
                ans[index] = 0;
            } else {
                if (index + num < ans.length && ans[index + num] == 0) {
                    ans[index] = num;
                    ans[index + num] = num;
                    if (dfs(n, index + 1, mask | (1 << num), ans))
                        return true;
                    ans[index] = 0;
                    ans[index + num] = 0;
                }
            }
        }
        return false;
    }
}
