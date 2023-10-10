class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        bubbleSort(nums,n);
        if(nums.length<=2){
            return -1;
        }
        return nums[1];
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