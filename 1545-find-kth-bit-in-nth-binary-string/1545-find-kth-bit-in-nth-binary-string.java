class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        for(int i = 1;i<n;i++){
            String curr = s;
            s = curr + "1"  + reverse(invert(curr));
            // System.out.println(s);
        }

        return s.charAt(k-1);
    }
    public String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public String invert(String str){
        StringBuilder sb = new StringBuilder();
        for(char bit : str.toCharArray()){
            if(bit == '1') sb.append('0');
            else sb.append('1');
        }
        return sb.toString();
    }
}