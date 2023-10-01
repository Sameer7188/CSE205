class MinStack {
    Stack<Long> st = new Stack<Long>();
    Long min;
    public MinStack() {
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long value = Long.valueOf(val);
        if(st.isEmpty()){
            min=value;
            st.push(value);
        }
        else{
            if(value<min){
                st.push(2*value - min);
                min = value;
            }
            else{
                st.push(value);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        Long val = st.pop();
        if(val<min){
            min = 2*min - val;
        }
    }
    
    public int top() {
        Long value = st.peek();
        if(value<min) return min.intValue();
        return value.intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */