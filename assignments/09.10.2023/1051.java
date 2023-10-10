class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        int[] copy = new int[n];
        for(int i=0;i<n;i++){
            copy[i] = heights[i];
        }
        sort(heights,n);
        for(int j=0;j<n;j++){
            if(heights[j] == copy[j]){
                continue;
            }
            else if(heights[j] != copy[j]){
                count++;
            }
        }
        return count;
    }
    public static void sort(int[] heights, int n){
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}