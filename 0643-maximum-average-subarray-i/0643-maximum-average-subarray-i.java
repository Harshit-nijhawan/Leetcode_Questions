class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k - 1;
        int sum = 0;
        int n = nums.length;
        for(int a = 0;a<k;a++){
            sum += nums[a];
        }
        int max = sum;
        while(j < n-1){
            sum -= nums[i];
            i++;j++; 
            sum += nums[j];
            max = Math.max(sum,max);
        }
        return (double)max/k;
    }
}