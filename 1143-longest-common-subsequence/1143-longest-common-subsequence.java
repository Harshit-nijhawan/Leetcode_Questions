class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return helper(text1,text2,0,0,dp);
    }
    public int helper(String a,String b,int i,int j,int dp[][]){
        if(i >= a.length() || j >= b.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j] = 1 + helper(a,b,i+1,j+1,dp);
        return dp[i][j] = Math.max(helper(a,b,i+1,j,dp),helper(a,b,i,j+1,dp));
    }
}