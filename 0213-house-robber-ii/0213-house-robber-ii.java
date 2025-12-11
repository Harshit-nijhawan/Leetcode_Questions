class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int dp[] = new int[n+1];
        int dp2[] = new int[n+1];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        int tookFirst = helper(nums,0,n-2,dp);
        int notTookFirst = helper(nums,1,n-1,dp2);
        return Math.max(tookFirst,notTookFirst);
    }
    public int helper(int nums[],int i,int n,int dp[]){
        if(i > n) return 0;
        if(dp[i] != -1) return dp[i];

        int steal = nums[i] + helper(nums,i+2,n,dp);
        int notSteal = helper(nums,i+1,n,dp);

        return dp[i] = Math.max(steal,notSteal);
    }
}