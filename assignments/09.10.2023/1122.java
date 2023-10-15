class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int temp = 0;
        for(int i=0;i<arr2.length;i++){
            int x = arr2[i];
            for(int j=0;j<arr1.length;j++){
                if(x==arr1[j]){
                    ans[temp++] = x;
                }
            }
        }
        int y = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int x = arr1[i];
            for(int j=0;j<arr2.length;j++){
                if(x==arr2[j]){
                    y = 1;
                    break;
                }
            }
            if(y==0){
                list.add(x);
            }
            y = 0;
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ans[temp++] = list.get(i);
        }
        return ans;
    }
}