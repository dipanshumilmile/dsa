class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int mod = 1_000_000_007;
        for(int i=1; i<=n; i++){
            int digits = (int)(Math.log(i) / Math.log(2)) + 1;
            result=((result<<digits) | i) % mod; 

        }
        return (int)result;
    }
}