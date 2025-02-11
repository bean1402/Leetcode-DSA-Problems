public class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int partLength = part.length();

        for (char c : s.toCharArray()) {
            sb.append(c);
            if (sb.length() >= partLength && sb.substring(sb.length() - partLength).equals(part)) {
                sb.setLength(sb.length() - partLength);
            }
        }

        return sb.toString();
    }
}
