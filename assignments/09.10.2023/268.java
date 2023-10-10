class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n-1;
       divide(arr,st,end);
        for(int i=0;i<n;i++){
            if(arr[i]!=i){
                return i;
            }
          
        }
        return n;
    }
    public static void sort(int[] arr, int st, int mid, int end) {
        int merged[] = new int[end - st + 1];
        int ind1 = st;
        int ind2 = mid + 1;
        int x = 0;
        while (ind1 <= mid && ind2 <= end) {
            if (arr[ind1] <= arr[ind2]) {
                merged[x++] = arr[ind1++];

            } else {
                merged[x++] = arr[ind2++];
            }

        }
        while (ind1 <= mid) {
            merged[x++] = arr[ind1++];
        }
        while (ind2 <= end) {
            merged[x++] = arr[ind2++];
        }
        for (int i = 0, j = st; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    } 
    static void divide(int[] arr, int st, int end) {
         
        if (st >= end) {
            return;
        }
        int mid = (st + end) / 2;
        divide(arr, st, mid);
        divide(arr, mid + 1, end);
        sort(arr, st, mid, end);
    }
}