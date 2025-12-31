class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1){
            return nums[0];
        }
        double max = Integer.MIN_VALUE;
        for(int i = 0;i<=nums.length - k;i++){
            int sum = 0;
            for(int j = 0;j<k;j++){
                sum += nums[i+j];
            }
            double avg = (double)sum / k;
            max = Math.max(avg,max);
        }
        return max;
    }
}