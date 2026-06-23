class Solution {
    public int longestOnes(int[] nums, int k) {
        int l =0;
         int r = 0;
         int maxOne = 0;
         int count = 0;
         while(r != nums.length){
            if(nums[r] == 0){
                count++;
            }
            if(count > k){
                while(nums[l] != 0){
                    l++;
                }
                l++;
                count--;
            }
            if(count <= k){
                maxOne = Math.max(r-l+1, maxOne);
            }
            r++;
        
         }
         return maxOne;
         

    }
}