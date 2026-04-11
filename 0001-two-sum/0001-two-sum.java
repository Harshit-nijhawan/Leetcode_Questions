class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int numPre = target - nums[i];
            if(map.containsKey(numPre)) {
                return new int[]{map.get(numPre),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
