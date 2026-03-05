class Solution {
    public int rob(int[] nums) {
        int house[] = new int[nums.length+1];
        house[0] = 0;
        house[1] = nums[0];
        for(int i = 2;i<=nums.length;i++){
            int take = nums[i-1] + house[i-2];
            int notTake = house[i-1];

            house[i] = Math.max(take,notTake);
        }

        return house[nums.length];

    }
}