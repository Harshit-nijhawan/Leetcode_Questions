class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);

        int Take_0_idx_house = helper(nums,0,n-2,dp);
        Arrays.fill(dp,-1);

        int Take_1st_idx_house = helper(nums,1,n-1,dp);

        return Math.max(Take_0_idx_house,Take_1st_idx_house);

    }
    public int helper(int nums[],int st,int n,int dp[]){
        if(st > n) return 0;

        if(dp[st] != -1) return dp[st];
        int steal = nums[st] + helper(nums,st+2,n,dp);
        int notSteal = helper(nums,st+1,n,dp);

        return dp[st] = Math.max(steal,notSteal);
    }
}