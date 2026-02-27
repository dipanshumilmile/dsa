class Solution {
    public int firstMissingPositive(int[] nums) {
      int i = 0;
      while(nums.length > i){
        int corrIndx = nums[i]-1;
        if(nums[i] > 0 && nums[i] <= nums.length && nums[corrIndx] != nums[i] ){
            int temp = nums[i];
            nums[i] = nums[corrIndx];
            nums[corrIndx] = temp;        
            }else{
                i++;
            }
      }
      for( i=0; i<nums.length; i++){
        if(nums[i]<0 || nums[i] != i+1){
            return i+1;
        }
      }
      return nums.length+1;
    }   
    }
