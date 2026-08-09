class Solution {
    Boolean [][]dp;
    public boolean canPartition(int[] nums) {
        int tSum =0;
        for(int num : nums){
            tSum += num;
        }

        if(tSum %2 != 0) return false;
        int target = tSum/2;
         dp = new Boolean[nums.length+1][target+1];
        return helper(nums, tSum/2, 0);
    }
    private boolean  helper(int []arr, int sum, int i){

   if(sum ==0) return true;
        if(i >= arr.length){
           
            return false;
        }
        
        if(dp[i][sum] != null)  return dp[i][sum] ;
        
        boolean take = false;
        if(sum >= arr[i]){
        take = helper(arr, sum-arr[i], i+1);
        }
      boolean skip = helper(arr, sum, i+1);
      return  dp[i][sum] = skip || take;
    }
}