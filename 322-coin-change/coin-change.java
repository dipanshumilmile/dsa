class Solution {

    int [][]dp ;
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = helper(coins, amount, 0);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    private int helper(int []coins, int amt, int i){

        if(amt == 0) return 0;
        if(i>= coins.length || amt < 0) return Integer.MAX_VALUE;

        if(dp[i][amt] != -1) return dp[i][amt];

         int pick = Integer.MAX_VALUE;

        int result = helper(coins, amt - coins[i], i);

        if (result != Integer.MAX_VALUE) {
            pick = 1 + result;
        }

        // SKIP: move to next coin
        int skip = helper(coins, amt, i + 1);
       
        return dp[i][amt] = Math.min(pick, skip);
    } 
}