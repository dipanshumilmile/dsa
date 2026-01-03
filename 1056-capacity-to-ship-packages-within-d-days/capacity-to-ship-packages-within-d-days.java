class Solution {
    boolean canShip(int[] weights, int days, int mid ){
        int load = 0;
        int usedDays = 1;
        for(int w : weights){
            if(load + w <= mid){
                load += w;
            }else{
                usedDays++;
                load = w;
            }
        }
        return usedDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r=0;
        for(int num : weights){
            r+=num;
            l=Math.max(num, l);
        }

        while(l < r){
            int mid = l + (r - l) / 2;
            if(canShip(weights, days, mid)){
            r = mid;
            }else
            l = mid + 1;
        }
        return l;
    }
}