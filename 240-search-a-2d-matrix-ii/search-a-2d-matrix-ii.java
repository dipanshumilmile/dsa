class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
       int n = matrix.length;
       int m = matrix[0].length;
       for(int i=0; i<n ;i++){
        if (target < matrix[i][0] || target > matrix[i][m - 1])
                {continue;}
        int start = 0; int end=matrix[0].length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(matrix[i][mid] > target)  end = mid-1;
            else if(matrix[i][mid] < target) start = mid+1;
            else return true;
        }
       } 
       return false;
    }
}