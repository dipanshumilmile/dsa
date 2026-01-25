class Solution {
    public int minSubArrayLen(int target, int[] nums) {
             int left = 0;
             int right = 0;
             int sum=0;
             int minLength=Integer.MAX_VALUE;
             int len=0;


             while(right != nums.length) {
               sum += nums[right];
                while(sum >= target){
                    len = right - left + 1;
                    minLength = Math.min(minLength, len);
                    sum -= nums[left];
                    left++;
                    
                }
              
                    right++;
                }


             
              return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}