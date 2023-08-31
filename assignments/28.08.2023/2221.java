class Solution {
    public int triangularSum(int[] nums) {
        int len = nums.length;
        for(int i =0;i<nums.length-1;i++)    {
            for(int j = 0;j<len-1;j++){
                
                nums[j] = (nums[j]+nums[j+1])%10;
            }
            len--;
        }
        return nums[0]%10;
    }
}