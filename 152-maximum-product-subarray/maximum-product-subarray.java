class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for(int i =1; i < nums.length; i++){
           int tempMax = Math.max(nums[i], Math.max(nums[i]*maxSoFar, nums[i]*minSoFar));
           minSoFar = Math.min(nums[i], Math.min(nums[i]*maxSoFar, nums[i]*minSoFar));
           maxSoFar = tempMax;
           result = Math.max(result, maxSoFar);
        }
        return result;
    }
}