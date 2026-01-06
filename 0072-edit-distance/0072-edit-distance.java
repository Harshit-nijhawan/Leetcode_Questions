class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[501][501];
        for(int i = 0;i<word1.length();i++){
            for(int j = 0;j<word2.length();j++){
                dp[i][j] = -1;
            }
        }
        return solve(word1,word2,0,0,dp);
    }
    public int solve(String s1,String s2,int i,int j,int dp[][]){
        if(i == s1.length()){
            return s2.length() - j;
        }
        if(j == s2.length()){
            return s1.length() - i;
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return solve(s1,s2,i+1,j+1,dp);
        }
        if(dp[i][j] != -1) return dp[i][j];
        int insert = 1 + solve(s1,s2,i,j+1,dp);
        int delete = 1 + solve(s1,s2,i+1,j,dp);
        int replace = 1 + solve(s1,s2,i+1,j+1,dp);
        return dp[i][j] = Math.min(insert,Math.min(delete,replace));
    }
}