class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int l = 0;
        while(l < sb.length()-1){
            if(Math.abs(sb.charAt(l) - sb.charAt(l + 1)) == 32){
                sb.deleteCharAt(l);
                sb.deleteCharAt(l);
                if(l > 0) l --;
            }
            else{
                l++;
            }
        }
        return sb.toString();
    }
}