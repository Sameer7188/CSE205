class Solution {
    public int largestInteger(int num) {
        String s = Integer.toString(num);

        PriorityQueue<Integer> oddPQ = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> evenPQ = new PriorityQueue<>((a,b)->b-a);

        for(char digit:s.toCharArray()){
            int val = digit - '0';

            if(val%2==0) evenPQ.add(val);
            else oddPQ.add(val);
        }
        int ans = 0;
        for(char digit:s.toCharArray()){
            ans = ans * 10;
            if((digit-'0')%2==0) ans = ans + evenPQ.poll();
            else ans = ans + oddPQ.poll();
        }
        return ans;
    }
}