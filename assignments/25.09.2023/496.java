import java.util.Stack;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            int num = nums2[i];
            if(s.isEmpty()){
                s.push(num);
                res[i] = -1;
                continue;
            }
            if(s.peek()>num){
                res[i] = s.peek();
                s.push(num);
                continue;
            }
            while(!s.isEmpty()&&s.peek()<=num){
                s.pop();
            }
            if(s.isEmpty()){
               res[i]= -1;
            }
            else{
                res[i] = s.peek();
            }
            s.push(num);
        }
       int []ans = new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
           int j=0;
           while(j!=nums2.length){
              if(nums1[i]==nums2[j]){
                    ans[i] = res[j];
                    break;
                }
                j++;
              
            }
        }
        return ans;
    }
}