class Solution {
    static long m = 1000000000 + 7;  
    private long pow(long x, long n){
        if(n==0) return 1;
        long half = pow(x, n/2);
        long res = (half * half)%m;
        if(n%2!=0) res = (x*res)%m;
        return res;
    }
    public int countGoodNumbers(long n) {

        return (int)((pow(5, (n+1)/2) * pow(4, n/2))%m);
        
    }
}