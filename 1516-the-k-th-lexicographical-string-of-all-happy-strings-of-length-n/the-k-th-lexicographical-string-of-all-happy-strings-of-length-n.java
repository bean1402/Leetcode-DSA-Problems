import java.util.*;

public class Solution {
    public String getHappyString(int n, int k) {
        Queue<String> queue = new LinkedList<>(Arrays.asList("a", "b", "c"));
        while (!queue.isEmpty()) {
            String s = queue.poll();
            if (s.length() == n) {
                k--;
                if (k == 0) {
                    return s;
                }
            } else {
                for (char ch : new char[]{'a', 'b', 'c'}) {
                    if (s.charAt(s.length() - 1) != ch) {
                        queue.offer(s + ch);
                    }
                }
            }
        }
        return "";
    }
}
