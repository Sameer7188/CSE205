class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        divide(nums,st,end);
        return nums;
    }
    public static void sort(int[] nums, int st, int mid, int end) {
        int merged[] = new int[end - st + 1];
        int ind1 = st;
        int ind2 = mid + 1;
        int x = 0;
        while (ind1 <= mid && ind2 <= end) {
            if (nums[ind1] <= nums[ind2]) {
                merged[x++] = nums[ind1++];

            } else {
                merged[x++] = nums[ind2++];
            }

        }
        while (ind1 <= mid) {
            merged[x++] = nums[ind1++];
        }
        while (ind2 <= end) {
            merged[x++] = nums[ind2++];
        }
        for (int i = 0, j = st; i < merged.length; i++, j++) {
            nums[j] = merged[i];
        }
    } 
    static void divide(int[] nums, int st, int end) {
         
        if (st >= end) {
            return;
        }
        int mid = (st + end) / 2;
        divide(nums, st, mid);
        divide(nums, mid + 1, end);
        sort(nums, st, mid, end);
    }
}