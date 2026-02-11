class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        int idx = 0;
        for(int i = k;i<n;i++){
            arr[idx] =nums[dq.peekFirst()];
            idx++;
            while(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        arr[idx] = nums[dq.peekFirst()];
        return arr;
    }

}