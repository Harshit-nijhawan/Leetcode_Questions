class Solution {
    public int maxEvents(int[][] event) {
        int n = event.length;
        if(n == 0) return 0;
        Arrays.sort(event,Comparator.comparingInt(o -> o[0]));
        int day = 0;
        int i = 0;
        int count = 0;
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        while(!pq.isEmpty() || i < n){
            if(pq.isEmpty()){
                day = event[i][0];
            }
            while(i < n && event[i][0] == day){
                pq.add(event[i][1]);
                i++;
            }
            if(!pq.isEmpty()){
                pq.poll();
                count++;
            }
            day++;
            while(!pq.isEmpty()  && pq.peek() < day){
                pq.poll();
            }
        }
        return count;
    }
}