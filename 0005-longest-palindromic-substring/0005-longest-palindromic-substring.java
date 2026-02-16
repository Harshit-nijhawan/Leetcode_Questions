class Solution {
    public String longestPalindrome(String s) {
        if(s == null && s.length() == 0) return "";
        String res = "";
        for(int i = 0;i<s.length();i++){
            String odd = helper(s,i,i);
            String even = helper(s,i,i+1);
            String longest = odd.length() > even.length() ? odd : even;
            if(longest.length() > res.length()){
                res = longest;
            }
        }
        return res;
    }
    public String helper(String s , int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}