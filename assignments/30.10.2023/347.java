class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        int idx = 0;
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> hp = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num: map.keySet()){
            hp.add(num);
            if(hp.size()>k){
                hp.poll();
            }
        }

        while(!hp.isEmpty()){
            ans[idx] = hp.poll();
            idx++;
        }
        return ans;
    }
}