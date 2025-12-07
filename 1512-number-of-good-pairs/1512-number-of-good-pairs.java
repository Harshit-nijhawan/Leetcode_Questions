class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                count += map.get(num);
                map.put(num,map.get(num) + 1);
            }
        }
        return count;
        

        // int n = nums.length;
        // int count = 0;
        // for(int i = 0;i<n-1;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}