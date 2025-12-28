class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length-1;
        int n = grid[0].length;
        int col = 0;
        int result =0;
        while(row>=0 && col <n){
            if(grid[row][col]>=0){
                col++;
            }
            else{
                result += n-col;
                row--;
            }
        }
        return result;
    }
}