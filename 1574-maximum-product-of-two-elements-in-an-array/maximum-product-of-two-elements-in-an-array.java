class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int currmax=nums[0];
        for(int i=1; i<nums.length; i++){
            max=Math.max(max, (currmax-1)*(nums[i]-1));
            if(currmax<nums[i]){
                currmax = nums[i];

            }
        }
        return max;
        
    }
}