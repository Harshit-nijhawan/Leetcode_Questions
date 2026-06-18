class Solution {
    public double angleClock(int hour, int minutes) {
       double angle = 0;
       if(hour == 12) angle = Math.abs((30 * 0) - (5.5 * minutes));
       else{
        angle = Math.abs((30 * hour) - (5.5 * minutes));
       }
       if(angle > 180) angle = 360 - angle;
       return angle;

    }
}