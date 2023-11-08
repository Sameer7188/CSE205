class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>((a,b)->b-a);

        for(int st:stones) maxheap.add(st);

        while(maxheap.size()!=1 && !maxheap.isEmpty()){
            int y = maxheap.poll();
            int x = maxheap.poll();
            
            if(x!=y) maxheap.add(y-x);
        }
        if(maxheap.size()==1) return maxheap.poll();
        return 0;
    }
}