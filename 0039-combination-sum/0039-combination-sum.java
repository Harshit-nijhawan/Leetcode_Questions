class Solution {
    List<List<Integer>>   ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      ArrayList<Integer> list = new ArrayList<>();
      fun(candidates,target,0,list,0);
      return ans;
    }
    public void fun(int[] candidates,int target,int i,ArrayList<Integer> list,int sum){
        if(sum == target){
            System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target) return;
        for(int j = i;j<candidates.length;j++){
            list.add(candidates[j]);
            fun(candidates,target,j,list,sum+candidates[j]);
            list.remove(list.size() - 1);
        }
    }
}