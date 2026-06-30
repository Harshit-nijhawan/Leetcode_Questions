// class Solution {
//     public int numberOfSubstrings(String s) {
//         int strLen = s.length();
//         HashSet<Character> set = new HashSet<>();
//         int count = 0;
//         for(int i = 0;i<strLen;i++){
//             set.add(s.charAt(i));
//             for(int j = i+1;j<strLen;j++){
//                 set.add(s.charAt(j));
//                 if(set.contains('a') && set.contains('b') && set.contains('c')){
//                     count += strLen - j;
//                     break;
//                 }
//             }
//             set.clear();
//         }
//         return count;
//     }
// }

class Solution {
    public int numberOfSubstrings(String s) {
        int strLen = s.length();
        int count = 0;
        
        // Replace the HashSet with 3 variables to store the last seen positions
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;
        
        // Use a single loop instead of nested loops
        for (int i = 0; i < strLen; i++) {
            char ch = s.charAt(i);
            
            // Update the last seen index of the current character
            if (ch == 'a') lastA = i;
            else if (ch == 'b') lastB = i;
            else if (ch == 'c') lastC = i;
            
            // If we have seen all three characters at least once
            if (lastA != -1 && lastB != -1 && lastC != -1) {
                // The smallest index among the three determines the start of the valid window.
                // Any substring starting from index 0 up to this minimum index is valid.
                int minIndex = Math.min(lastA, Math.min(lastB, lastC));
                count += minIndex + 1;
            }
        }
        return count;
    }
}
