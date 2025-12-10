class Solution {
    int M = 1000000000+7;
    public int countPermutations(int[] arr) {
        long fact = 1;
        int n = arr.length;
        for(int i = 1;i<n;i++){
            if(arr[0]>= arr[i]) return 0;
        }

        for(int i = n-1;i>=1;i--){
            fact = (fact * i) % M;
        }
        return (int) fact;
    }
}