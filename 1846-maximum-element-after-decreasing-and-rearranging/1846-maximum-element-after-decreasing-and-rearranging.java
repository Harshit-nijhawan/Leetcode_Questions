class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr) ;
        arr[0] = 1;
        // int max = 1 ;
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = Math.min(arr[i] , 1 + arr[i-1]) ;
            // max = Math.max(arr[i] , max) ;
        }
        return arr[arr.length-1] ;
    }
}