class Solution {
    private boolean canEatAll(int[] piles, int mid, int h){
        int totalEat=0;
        for(int pile : piles){
            totalEat += pile/mid;
            if(pile%mid != 0){
                totalEat++;
            }

        }
        return totalEat <= h;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int r=0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        int l = 1;
        


        while(l<r){
            int mid = l + (r-l)/2;
            if(canEatAll(piles, mid, h)){
                r = mid;
            }
            else{
                l = mid+1;
            }

        }
        return l;
    }
}