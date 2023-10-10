class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        bubbleSort(prices,n);
        for(int i=0;i<prices.length;i++){
            if(prices[i]+prices[i+1]<=money){
                int x = money - (prices[i]+prices[i+1]);
                return x;
            }
            else{
                return money;
            }
        }
        return 0;
    }
    static void bubbleSort(int[] prices, int n)
    {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;                    
                }
            }
        }
    }
 
}