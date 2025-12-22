class Solution {
    public int maxProfit(int[] price) {
        int n = price.length;
        int  maxProfit=0;
        int minValue=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(minValue>price[i]){
                minValue=price[i];
            }
            else{
                if(price[i]-minValue>0){
                    maxProfit += price[i]-minValue;
                    minValue=price[i];
                }
            }
        }
        return maxProfit;
    }
}