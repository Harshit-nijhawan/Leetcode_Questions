class Solution {
    int MOD = 1000000000+7;

    public int specialTriplets(int[] nums) {
        long result = 0;
        HashMap<Integer,Integer> rightMap = new HashMap<>();
        HashMap<Integer,Integer> leftMap = new HashMap<>();

        for(int a : nums){
            rightMap.put(a, rightMap.getOrDefault(a, 0) + 1);
        }

        for(int j = 0; j < nums.length; j++){
            int num = nums[j];

            int freq = rightMap.get(num) - 1;
            if (freq <= 0) rightMap.remove(num);
            else rightMap.put(num, freq);

            int target = num * 2;

            long left = leftMap.getOrDefault(target, 0);
            long right = rightMap.getOrDefault(target, 0);

            result = (result + (left * right) % MOD) % MOD;

            leftMap.put(num, leftMap.getOrDefault(num, 0) + 1);
        }

        return (int) result;
    }
}
