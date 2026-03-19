class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length;
        for(int i = 0;i<strs[0].length();i++){
            if(strs[0].charAt(i) != strs[n-1].charAt(i)) break;
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}