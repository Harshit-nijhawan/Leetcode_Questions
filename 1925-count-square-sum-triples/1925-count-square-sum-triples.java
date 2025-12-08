class Solution {
    public int countTriples(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i = 1;i<=n;i++){
            ans.add(i * i);
        }
        for(int i = 0;i<ans.size();i++){
            for(int j = 0;j<ans.size();j++){
                for(int k = 0;k<ans.size();k++){
                    if(ans.get(i)+ans.get(j) == ans.get(k)){
                    count++;
                }
                }
                
            }
        }
        return count;
    }
}