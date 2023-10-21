class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int x = target-nums[i];
            if(hm.containsKey(x) && i!=hm.get(x)){
                return new int[]{i,hm.get(x)};
            }
        }
        return new int[]{-1,-1};
    }
}