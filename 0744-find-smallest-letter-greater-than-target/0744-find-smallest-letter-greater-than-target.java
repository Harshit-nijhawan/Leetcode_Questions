class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int smallestDiff = Integer.MAX_VALUE;
        char ans = letters[0];

        for (char ch : letters) {
            int diff = (ch - target + 26) % 26;
            if (diff > 0 && diff < smallestDiff) {
                smallestDiff = diff;
                ans = ch;
            }
        }
        return ans;
    }
}