class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        dp =  new int[m][n];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,0,m,n,obstacleGrid);
    }
    int solve(int i,int j,int m,int n,int[][] grid){
        if((i==m-1 && j==n-1) && grid[i][j]!=1) return 1;
        if(i>=m || j>=n) return 0;
        if(grid[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int right=solve(i,j+1,m,n,grid);
        int down=solve(i+1,j,m,n,grid);
        return dp[i][j]=right+down;
    }
}