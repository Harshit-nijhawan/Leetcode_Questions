class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0;
        int n =colors.length;
        for(int i = 0;i<n;i++){
            // for(int j = i+1;j<n;j++){
            //     if(colors[i] != colors[j]){
            //         ans = Math.max(ans,j - i);
            //     }
            // }

            if(colors[i] != colors[0]){
                ans = Math.max(ans,i);
            }
            if(colors[i] != colors[n-1]){
                ans = Math.max(ans,n - 1 - i);
            }
        }
        return ans;
    }
}