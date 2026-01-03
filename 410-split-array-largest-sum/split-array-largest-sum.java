class Solution {
    private boolean canSplit(int[] nums, int k, int mid){
     int subArray = 1;
     int sum = 0;
      for(int num : nums){
      if(sum + num <= mid){
      sum += num;

      }else
      {
      subArray++;
      sum = num;
      }
      
      }
      return subArray <= k;


    }
    public int splitArray(int[] nums, int k) {
        int l =0;
         int r = 0;
         for(int num : nums){
             r += num;
              l = Math.max(num, l);
         }

         while( l < r){
            int mid = l + (r - l) / 2;
            if(canSplit(nums, k, mid)){
                r=mid;
            }else{
                l = mid + 1;
            }



         }
         return l;
    } 
}