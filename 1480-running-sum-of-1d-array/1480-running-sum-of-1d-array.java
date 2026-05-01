class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        int pre = ans[0];
        for(int i = 1;i<nums.length;i++){
            pre = pre + nums[i];
            ans[i] = pre;
        }
        return ans;
    }
}