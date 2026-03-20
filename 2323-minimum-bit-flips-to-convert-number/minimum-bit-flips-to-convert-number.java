class Solution {
    public int minBitFlips(int start, int goal) {
        int res = (start ^ goal);
        int ans = Integer.bitCount(res);

        return ans;
    }
}