class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int mod = 1_000_000_007;
        int len=0;
        for(int i=1; i<=n; i++){
             if(((i-1)&i)==0) len++;
            result=((result<<len) | i) % mod; 

        }
        return (int)result;
    }
}