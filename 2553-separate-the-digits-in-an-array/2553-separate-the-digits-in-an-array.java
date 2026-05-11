class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            ArrayList<Integer> list = new ArrayList<>();
            while(num != 0){
                list.add(num % 10);
                num /= 10;
            }
            Collections.reverse(list);
            for(int i = 0;i<list.size();i++){
                ans.add(list.get(i));
            }
        }
        int res[] = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}