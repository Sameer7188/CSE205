import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> s1 = new Stack<>();
        StringBuilder b1 = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(!s1.isEmpty() && s.charAt(i)=='*'){
                s1.pop();
            }
            else if(s.charAt(i)!='*'){
                s1.add(s.charAt(i));
            }
    
        }
        for (char chr : s1){
            b1.append(chr);
        }
        return b1.toString();
    }
}