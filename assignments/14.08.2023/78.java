class Solution {
     public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list1  = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        sub(nums,list1,ll,0);
        return ll;
    }

    private static void sub(int[] nums, List<Integer> list1, List<List<Integer>> ll, int n) {
        if(nums.length==n){
            ll.add(new ArrayList<>(list1));
            return ;
        }
        list1.add(nums[n]);
        sub(nums, list1, ll, n+1);
        list1.remove(list1.size()-1);
        sub(nums, list1, ll, n+1);
    }
}