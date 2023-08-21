class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        temp(ans, "", n, n);
        return ans;
    }
    public static void temp(List<String> ans , String v, int l, int r){
        if(l==0 && r==0){
            ans.add(v);
            return;
        }
        if(l>0){
            temp(ans, v+"(", l-1, r);
        }
        if(r>l){
            temp(ans, v+")", l, r-1);
        }
    }
}