class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<> ();
        int res = 0;
        for(String s:tokens){
            if(s.matches("-?\\d+")) {
                st.push(Integer.parseInt(s));
            } else {
                int op2=st.pop();
                int op1=st.pop();
                switch(s) {
                    case "+" : res=op1+op2; break;
                    case "-" : res=op1-op2; break;
                    case "*" : res=op1*op2; break;
                    case "/" : res=op1/op2; break;
                    default: System.out.println("Invalid Operator");
                }
                st.push(res);
            }
        }
        return st.peek();
    }
}