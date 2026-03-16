class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 2){
            return nums[0] + nums[1];
        }
        int j = n-1;
        int ans = 0;
        for(int i = 0;i<n/2;i++){
            // if(j > i){
                ans = Math.max(ans,nums[i] + nums[j]);
                j--;
            // }
            
        }
        return ans;
    }
}