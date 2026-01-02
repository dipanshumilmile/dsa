class Solution {

    private int canMakeBouquets(int[] bloomDay, int mid, int k){
        int consecutiveCount =0;
        int countBouquets = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                consecutiveCount++;
            }else{
                consecutiveCount=0;
            }
            if(consecutiveCount == k){
                countBouquets++;
                consecutiveCount=0;
            }
        }
        return countBouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l = 1;
        int r = 0;
        for(int bloom : bloomDay){
            r = Math.max(bloom, r);
        }

        int res = -1;

        while(l <= r){
            int mid = l + (r - l)/3;

            if(canMakeBouquets(bloomDay, mid, k) >= m){
                res = mid;
                r=mid-1;
            }else{
                l = mid + 1;
            }
        }
        return res;
    }
}