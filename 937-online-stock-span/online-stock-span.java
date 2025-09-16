class StockSpanner {

    private Stack<int[]> st;
    private int index;



    
    public StockSpanner() {
        st = new Stack<>();
        index = -1;
    }



    
    public int next(int price) {


        index++;
        while(!st.isEmpty() && st.peek()[0] <= price){
            st.pop();
        }


        int ans = index - (st.isEmpty() ? -1 : st.peek()[1]);
        st.push(new int[]{price,index});

        return ans;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */