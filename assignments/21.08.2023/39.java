class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        combsum(0, candidates, target, l1);   
        return ans;
    }
    public static void combsum(int i, int[] candidates, int target,List<Integer> l1){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(l1));
            }
            return;
        }
        if(candidates[i]<= target){
            l1.add(candidates[i]);
            combsum(i, candidates, target - candidates[i], l1);
            l1.remove(l1.size()-1);
        }
        combsum(i+1, candidates, target, l1);
    }
}