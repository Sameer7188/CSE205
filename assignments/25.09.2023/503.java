class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i=2*nums.length;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(i<nums.length){
                if(!st.isEmpty()){
                    ans[i] = st.peek();
                }
                else{
                    ans[i] = -1;
                }
            }
            st.push(nums[i%nums.length]);
        }
        return ans;
    }
}