class Solution {
    public int titleToNumber(String s) {
        if(s == null) return -1;
        int result = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
        
        // if(s == null) return -1;
        // int sum = 0;
        // for(char c : s.toCharArray()){
        //     sum *= 26;
        //     sum += c - 'A' + 1;
        // }
        // return sum;
    }
}
