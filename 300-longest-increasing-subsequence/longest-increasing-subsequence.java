class Solution {
    int dp[][];
    private int helper(int []nums,int i,  int prev){
        if(i == nums.length) return 0;
        if(dp[i][prev+1] != -1) return dp[i][prev+1];
        int len= helper(nums, i+1, prev);
        if(prev == -1 || nums[i] > nums[prev]){
            int take = 1 + helper(nums, i+1, i);
            len = Math.max(len, take);
        }
        return dp[i][prev+1] = len;
    }
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length+1];
        for(int []ar : dp){
            Arrays.fill(ar, -1);
        }
        return helper(nums, 0, -1);
    }
}