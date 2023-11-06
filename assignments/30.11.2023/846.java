class Solution{
    public static boolean isNStraightHand(int[] hand, int groupsize){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(hand.length%groupsize!=0) return false;
        else{
            for(int num:hand) pq.add(num);

            while (!pq.isEmpty()) {
                int n = pq.poll();

                for(int i=1;i<groupsize;i++){
                    if(!pq.remove(n+i)) return false;
                }
            }
        }
        return true;
    }
}