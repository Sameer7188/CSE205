class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permut(0, nums, ans);
        return ans;
    }
    public static void swep(int i, int j,int nums[]){
        int tempery = nums[i];
        nums[i] = nums[j];
        nums[j] = tempery;
    }
    public static void permut(int a,int nums[], List<List<Integer>> ans){
        if(nums.length == a){
            List<Integer> list_1 = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list_1.add(nums[i]);
            }
            ans.add(list_1);
            return;
        }
        for(int i = a;i<nums.length;i++){
            swep(i, a, nums);
            permut(a+1, nums, ans);
            swep(i, a, nums);
        }
    }
}