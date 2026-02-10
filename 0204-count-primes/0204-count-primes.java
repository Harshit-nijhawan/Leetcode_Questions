class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;
        int cnt = 0;
        boolean arr[] = new boolean[n];
        for(int i = 0;i<n;i++){
            arr[i] = true;
        }
        for(int i = 2;i*i <= n;i++){
            if(arr[i]){
                for(int j = i * i;j<n;j=j+i){
                    arr[j] = false;
                }
            }
        }
        for(int i = 2;i<n;i++){
            if(arr[i]) cnt++;
        }
        return cnt;
    }
}