class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE; 
        int closestSum =0;
        
        for(int i=0; i<nums.length-2; i++){
            int left =i+1;
        int right=nums.length-1;
        
        while(left < right){
            int sum = nums[left] + nums[right] + nums[i];
            

             int diff = Math.abs(sum - target);
             if(diff < minDiff){
                minDiff = diff;
                closestSum = sum;
             }
             if(sum > target) right--;
             else if(sum<target) left++;
             else return sum;
            
        }
        }
        return closestSum;
    }
}