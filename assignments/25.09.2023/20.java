class Solution{

    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                s1.push(c);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                else{
                    char top = s1.peek();
                    if((c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='[')){
                        s1.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return s1.isEmpty();
    }
}
