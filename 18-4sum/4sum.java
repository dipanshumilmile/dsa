class Solution {
    List<List<Integer>>  res = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length < 4) return res;
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                 long newTarget = (long) target - nums[i] - nums[j];
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    long sum = (long)nums[left] + nums[right];
                    if(sum < newTarget){
                        left++;
                    }
                    else if(sum > newTarget) right--;
                    else {
                        res.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;

                    }
                }

            }
        }
        return res;

        
    }
}