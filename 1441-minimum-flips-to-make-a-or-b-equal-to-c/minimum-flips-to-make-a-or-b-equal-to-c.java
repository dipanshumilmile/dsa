class Solution {
    public int minFlips(int a, int b, int c) {
        int res = (a|b)^c;
        int res1 = (a&b);
        int res2 = (res1&res);

        return Integer.bitCount(res)+Integer.bitCount(res2);
    }
}