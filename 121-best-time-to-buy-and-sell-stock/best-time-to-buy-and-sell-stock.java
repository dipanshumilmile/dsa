class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int min = prices[0];
        for(int i=0; i<prices.length; i++){
            diff=Math.max(diff, prices[i]-min);
            min=Math.min(min, prices[i]);
        }
        return diff;



    }
}