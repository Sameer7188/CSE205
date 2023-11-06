class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>((a,b)->b-a);
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<score.length;i++){
            PQ.add(score[i]);
            mp.put(score[i],i);
        }
        String[] ans = new String[score.length];
        int rank = 1;
        while(!PQ.isEmpty()){
            int top = PQ.poll();
            int idx = mp.get(top);

            if(rank==1) ans[idx] = "Gold Medal";
            else if(rank==2) ans[idx] = "Silver Medal";
            else if(rank==3) ans[idx] = "Bronze Medal";
            else ans[idx] = String.valueOf(rank);
            rank++;
        }
        return ans;
    }
}