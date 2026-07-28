class Solution {
    private int helper(int []arr, int target, int i){
        if(i == arr.length) {
            if (target == 0){
                return 1;
            } 
            return 0;
        }
        int add = helper(arr, target-arr[i], i+1);
        int substract = helper(arr, target+arr[i], i+1);
        
        return add + substract;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target,0);
    }
}