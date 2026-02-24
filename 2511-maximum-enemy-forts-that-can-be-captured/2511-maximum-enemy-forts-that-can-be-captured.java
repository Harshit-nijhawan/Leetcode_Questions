class Solution {
    public int captureForts(int[] forts) {
       int i = 0;
       int ans = 0;
       for(int j = 0;j<forts.length;j++){
        if(forts[j] != 0){
            if(forts[i] == -forts[j]){
                ans = Math.max(ans,j - i - 1);
            }
            i = j;
        }
       }
       return ans;
    }
}