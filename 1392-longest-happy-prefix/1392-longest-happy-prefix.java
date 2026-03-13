class Solution {
    public String longestPrefix(String s) {
        int lps[] = new int[s.length()];
        int prev = 0,suff = 1;
        while(suff < s.length()){
            if(s.charAt(prev) == s.charAt(suff)){
                lps[suff] = prev + 1;
                prev++;
                suff++;
            }
            else{
                if(prev == 0){
                    lps[suff] = 0;
                    suff++;
                }
                else{
                    prev = lps[prev - 1];
                }
            }
        }
        return s.substring(0,lps[s.length()-1]);
    }
}