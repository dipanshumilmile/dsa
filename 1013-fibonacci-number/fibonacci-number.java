class Solution {
    Integer[] dp;
    public int fib(int n) {
     dp = new Integer[n+1];
  return helper(n);
        
    }
    private int helper(int n){
   if(n <= 1) return n;

   if(dp[n] != null) return dp[n];
 return   dp[n] = helper(n-1) + helper(n-2);

    }
    
    
}