class Solution {
    int [][]dp;
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

  dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
int sum =Integer.MAX_VALUE;
for(int i=0; i<n; i++)
      sum = Math.min(sum,helper(m, n, matrix,0, i));    
return sum;
    }
    private int helper(int m, int n, int [][]matrix, int i, int j){

        if(j < 0 || j >= n) return Integer.MAX_VALUE;
      

        if(i == m-1) return matrix[i][j];

       
           if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }

        int down = helper(m, n, matrix, i+1, j);
        int d1 =  helper(m, n, matrix, i+1, j+1);
        int d2 =  helper(m, n, matrix, i+1, j-1);

        return dp[i][j] = matrix[i][j] + Math.min(down, Math.min(d1, d2));
        
    }
}