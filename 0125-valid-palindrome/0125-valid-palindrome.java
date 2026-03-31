class Solution {
    public boolean isPalindrome(String s) {
        String combined = s.replaceAll("[^a-zA-Z0-9]","");
        String res = combined.toLowerCase();
        int i = 0;
        int j = res.length() - 1;
        while(i < j){
            if(res.charAt(i) != res.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}