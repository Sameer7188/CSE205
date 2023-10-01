import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1 = new Stack<>();

        for(String s : operations){
            if(s.equals("C")){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }
            else if(s.equals("D")){
                if(!s1.isEmpty()){
                    s1.push(2*s1.peek());
                }
            }
            else if(s.equals("+")){
                if(s1.size()>=2){
                    int l1 = s1.pop();
                    int l2 = s1.pop();
                    int ans = l1+l2;
                    s1.push(l2);
                    s1.push(l1);
                    s1.push(ans);
                }
            }
            else{
                s1.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!s1.isEmpty()){
            sum = sum + s1.pop();
        }
        return sum;
    }
}