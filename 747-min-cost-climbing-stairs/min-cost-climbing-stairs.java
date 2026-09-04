class Solution {
    Integer dp[];
    public int minCostClimbingStairs(int[] cost) {
        dp = new Integer[cost.length+1];
        return Math.min(helper(cost, 0), helper(cost, 1));
    }
    private int helper(int[]cost, int i){
        if(i>= cost.length) return 0;
        if(dp[i] != null) return dp[i];
        return dp[i] = cost[i] + Math.min(helper(cost, i+1) , helper(cost, i+2));
    }
}