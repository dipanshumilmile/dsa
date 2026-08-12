class Solution {
    int dp[][];
    public int minDistance(String word1, String word2) {
        int m = word1.length(); int n = word2.length();
        dp = new int[m][n];

        for(int []arr : dp){
            Arrays.fill(arr, -1);
        }
        return helper(word1, word2, 0, 0);
    }
    private int helper(String s1, String s2, int i, int j){
        if(i == s1.length()){
            return s2.length()-j;
        }
        if(j == s2.length()) return s1.length()-i;

        if(dp[i][j] !=-1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = helper(s1, s2, i+1, j+1);

        int insert = 1+ helper(s1, s2, i,j+1);
        int delete = 1 + helper(s1, s2, i+1, j);
        int replace = 1 + helper(s1, s2, i+1, j+1);

        return dp[i][j] =Math.min(insert, Math.min(replace, delete));
    } 
}