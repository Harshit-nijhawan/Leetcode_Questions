class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return null;
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char innerStr[] = strs[i].toCharArray();
            Arrays.sort(innerStr);
            String s = new String(innerStr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());

    //     int n = strs.length;
    //     String temp[] = new String[n];
    //     for(int i = 0;i<n;i++){
    //         temp[i] = strs[i];
    //     }
    //     for(int i = 0;i<n;i++){
    //         strs[i] = sortString(strs[i]);
    //     }
    //     // Arrays.sort(strs);
    //     List<List<String>> ans = new ArrayList<>();
    //     boolean visited[] = new boolean[n];
    //     for(int i = 0;i<n;i++){
    //         if(visited[i]) continue;
    //         List<String> innerList = new ArrayList<>();
    //         innerList.add(temp[i]);
    //         for(int j = i+1;j<n;j++){
    //             if(strs[i].equals(strs[j])) {
    //                 innerList.add(temp[j]);
    //                 visited[j]= true;
    //             }
    //         }
    //         ans.add(innerList);
    //     }
    //     return ans;
    // }
    // public String sortString(String strs){
    //     char arr[] = strs.toCharArray();
    //     Arrays.sort(arr);
    //     return new String(arr);
    // }
    }
}