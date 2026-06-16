class Solution {
    public int subarraySum(int[] nums, int k) {
        // int ans = 0;
        // for(int i = 0 ;i<n;i++){
        //     int sum = 0;
        //     for(int j = i;j<n;j++){          // Brute Force 
        //         sum += nums[j];
        //         if(sum == k) ans++;
        //     }
        // }
        // return ans;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int prefixSum = 0;
        for(int num : nums){
            prefixSum += num;
            if(map.containsKey(prefixSum - k)){
                res += map.get(prefixSum - k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return res;

        
    }
}