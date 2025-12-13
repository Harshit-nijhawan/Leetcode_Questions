class Solution {
    public int maxEvents(int[][] event) {
        int n = event.length;
        if(n == 0) return 0;
        //sort according to the start day of the event
        Arrays.sort(event,Comparator.comparingInt(o -> o[0]));
        int day = 0;
        int i = 0;
        int count = 0;
        //Min heap to add the end day of the event and that shuld be sorted in increasing order
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        while(!pq.isEmpty() || i < n){
            //to start with the day of the event on which i is
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
            //to skip the events which are less than the day we are
            while(!pq.isEmpty()  && pq.peek() < day){
                pq.poll();
            }
        }
        return count;
    }
}