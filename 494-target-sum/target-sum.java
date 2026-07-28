class Solution {
    int absSum;
    private int helper(int []arr, int target, int i, int sum, int [][] dp){
        if(i == arr.length) {
            if (target == sum){
                return 1;
            } 
            return 0;
        }

        if(dp[i][sum+absSum] != -1) return dp[i][sum+absSum];

        int add = helper(arr, target, i+1, sum+arr[i], dp);
        int substract = helper(arr, target, i+1, sum-arr[i], dp);
        
        return dp[i][sum+absSum] = add + substract;
    }
    public int findTargetSumWays(int[] nums, int target) {
        absSum = 0;
        for(int arr : nums) absSum += Math.abs(arr);
        int dp[][] = new int[nums.length][absSum*2 + 1];
                for (int[] row : dp)
                    Arrays.fill(row, -1);
        return helper(nums, target,0, 0, dp);
    }
}