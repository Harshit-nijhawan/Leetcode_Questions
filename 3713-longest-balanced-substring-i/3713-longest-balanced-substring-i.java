class Solution {
    boolean checkBalance(int arr[]){
        int common = 0;
        for(int i = 0;i<26;i++){
            if(arr[i] == 0) continue;
            if(common == 0) common = arr[i];
            if(arr[i] != common) return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0;i<n;i++){
            int arr[] = new int[26];
            for(int j = i;j<n;j++){
                arr[s.charAt(j) - 'a']++;
                if(checkBalance(arr)){
                    ans = Math.max(ans,j - i + 1);
                }
            }
        }
        return ans;
    }
}