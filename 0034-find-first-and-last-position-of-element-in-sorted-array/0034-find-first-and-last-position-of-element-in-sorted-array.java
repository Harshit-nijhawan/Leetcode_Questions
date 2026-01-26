class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = findFirst(nums,target,n);
        int last = findLast(nums,target,n);
        return new int[]{first,last};
    }
    public int findFirst(int nums[],int target,int n){
        int l = 0,r = n-1;
        int left = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                left = mid;
                r = mid - 1;
            }
            else if(nums[mid] < target){
                l = mid +1;
            }
            else{
                r = mid - 1;
            }
        }
        return left;
    }
    public int findLast(int nums[],int target,int n){
        int l = 0,r = n-1;
        int right = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                right = mid;
                l = mid + 1;
            }
            else if(nums[mid] < target){
                l = mid +1;
            }
            else{
                r = mid - 1;
            }
        }
        return right;
    }
}