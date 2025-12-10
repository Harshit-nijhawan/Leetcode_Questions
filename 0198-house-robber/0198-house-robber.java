class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp [] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,n,dp);
    }
    public int helper(int nums[],int i,int n,int [] dp){
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];
        int steal = nums[i]+helper(nums,i+2,n,dp);
        int notSteal = helper(nums,i+1,n,dp);
        dp[i] = Math.max(steal,notSteal);
        return dp[i];
    }
}