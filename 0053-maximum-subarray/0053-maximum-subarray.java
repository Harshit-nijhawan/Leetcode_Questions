class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // int ans = nums[0];
        // for(int i = 0;i<n;i++){
        //     int sum = nums[i];
        //     ans = Math.max(ans,sum);         // Brute Force
        //     for(int j = i+1;j<n;j++){
        //         sum += nums[j];
        //         ans = Math.max(ans,sum);
        //     }
        // } 
        // return ans;

        int ans = nums[0];
        int currSum = nums[0];
        for(int i = 1;i<n;i++){
            currSum = Math.max(currSum+nums[i],nums[i]);
            ans = Math.max(ans,currSum);

        }
        return ans;
    }
}