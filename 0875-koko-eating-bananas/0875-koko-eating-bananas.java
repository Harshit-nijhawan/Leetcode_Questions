class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(piles[i],max);
        }
        int low = 1,high = max,ans = max;
        while(low <= high){
            int mid = (low + high)/2;
            long hours = 0; 
            for(int pile : piles)               {
                hours += (pile + mid - 1) / mid;
            }
            if(hours <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    }
}