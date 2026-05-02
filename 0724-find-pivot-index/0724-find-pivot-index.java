class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        for(int i = 0;i<n;i++){
            if(i == 0) pre[i] = 0;
            else{
                pre[i] = pre[i-1] + nums[i-1];
            } 
        }
        for(int i = n-1;i>=0;i--){
            if(i == n-1) suff[i] = 0;
            else{
                suff[i] = suff[i+1] + nums[i+1];
            } 
        }
        for(int i = 0;i<n;i++){
            if(pre[i] == suff[i]) return i;
        }
        return -1;
    }
}