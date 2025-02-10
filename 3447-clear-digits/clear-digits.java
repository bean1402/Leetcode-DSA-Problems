public class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (result.length() > 0) {
                    result.setLength(result.length() - 1); // Remove the last character
                }
            } else {
                result.append(c); // Append non-digit character
            }
        }

        return result.toString();
    }
}
