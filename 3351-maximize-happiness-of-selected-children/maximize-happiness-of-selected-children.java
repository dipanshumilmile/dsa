class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i=0;
        long sum=0;
        while(k>0){
            if(happiness[happiness.length-i-1]-i>0)  sum +=  happiness[happiness.length-i-1]-i;
            i++;

            k--;


        }
        return sum;
    }
}