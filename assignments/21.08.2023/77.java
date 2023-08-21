class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        comb(n, k, 1, l1, ans);
        return ans;
    }
        public static void comb(int n,int k, int b,ArrayList<Integer> l1,List<List<Integer>> ans){
        if(l1.size()==k){
            ans.add(new ArrayList<>(l1));
            return;
        }
        for(int a = b; a<=n;a++){ 
            l1.add(a);
            comb(n, k, a+1, l1, ans);
            l1.remove(l1.size()-1);
        }
    }
}