class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            while(!st.empty() && k>0 && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";

         StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}