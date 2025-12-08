class Solution {
    int MOD = 1000000000 + 7;
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        for(int i= 0;i<n;i++){
            nums[i] = nums[i] - rev(nums[i]);
        }
        Map<Integer,Integer>  map = new HashMap<>();
        int result = 0;
        for(int i = 0;i<n;i++){
            result = (result + (map.containsKey(nums[i])? map.get(nums[i]) : 0)) % MOD;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return result;

    }
    public int rev(int num){
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}