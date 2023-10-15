class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
      List<Integer>[] l = new ArrayList[nums.length+1];
      for(int key: hm.keySet()){
          int freq = hm.get(key);
          if(l[freq]==null){
              l[freq] = new ArrayList();
          }
          l[freq].add(key);
      }
     
      int[] arr= new int[k];
      int j =0;
       for(int i=nums.length;i>=0&&j<k;i--){
          if(l[i]!=null){
              for(int ele:l[i]){
                  arr[j++]  =ele;
              }
          }
       }
       return arr;
    }
}