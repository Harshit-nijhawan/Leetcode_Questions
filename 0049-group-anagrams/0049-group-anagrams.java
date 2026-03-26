class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        String temp[] = new String[n];
        for(int i = 0;i<n;i++){
            temp[i] = strs[i];
        }
        for(int i = 0;i<n;i++){
            strs[i] = sortString(strs[i]);
        }
        // Arrays.sort(strs);
        List<List<String>> ans = new ArrayList<>();
        boolean visited[] = new boolean[n];
        for(int i = 0;i<n;i++){
            if(visited[i]) continue;
            List<String> innerList = new ArrayList<>();
            innerList.add(temp[i]);
            for(int j = i+1;j<n;j++){
                if(strs[i].equals(strs[j])) {
                    innerList.add(temp[j]);
                    visited[j]= true;
                }
            }
            ans.add(innerList);
        }
        return ans;
    }
    public String sortString(String strs){
        char arr[] = strs.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}