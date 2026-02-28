class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int []nextGreater = new int[n];
        for(int i = 2*n-1; i>=0; i--){
            int indx = i%n;
            while(!s.isEmpty() && nums[indx] >= nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[indx] = -1;
                
            }else{
                 nextGreater[indx] = nums[s.peek()];
            }
            s.push(indx);
            
        }
        return nextGreater;
    }
}