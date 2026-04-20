class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char str[] = s.toCharArray();
        int n = str.length;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0;i<n/2;i++){
            if(isVowel(str[i])) cnt1++;
        }
        for(int i = n/2;i<n;i++){
            if(isVowel(str[i])) cnt2++;
        }
        return cnt1 == cnt2;
    }
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
}