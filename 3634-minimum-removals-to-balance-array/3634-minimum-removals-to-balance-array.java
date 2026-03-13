class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = 0;
        int L = 1;
        int minEle = nums[0];
        int maxEle = nums[0];
        while(j <n){
            minEle = nums[i];
            maxEle = nums[j];
            while(i < j && maxEle > (double)k * minEle){
                i++;
                minEle = nums[i];
            }
            L = Math.max(L,j - i + 1);
            j++;
        }
        return n - L;
    }
}