class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i <nums.length){
            int corrIndex = nums[i]-1;
            if(nums[i] != nums[corrIndex]){
                int temp = nums[i];
                nums[i] = nums[corrIndex];
                nums[corrIndex] = temp;
            }else i++;
        }
        List<Integer> list = new ArrayList<>();
        for(i=0; i<nums.length; i++){
            if(nums[i]-1 != i){
                list.add(nums[i]);
            }
        }
        return list;
    }
}