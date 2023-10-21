class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for(int n:nums){
            int curr = map.getOrDefault(n,0);
            map.put(n,curr+1);
            total = total + curr;
        }
        return total;
    }
}