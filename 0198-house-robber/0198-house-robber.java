class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,nums.length,dp);
    }
    public int helper(int nums[],int st,int n,int dp[]){
        if(st >= n) return 0;
        if(dp[st] != -1) return dp[st];
        int take = nums[st] + helper(nums,st+2,n,dp);
        int notTake = helper(nums,st+1,n,dp);

        return dp[st] = Math.max(take,notTake);
    }
}