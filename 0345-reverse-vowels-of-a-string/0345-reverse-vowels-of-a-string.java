class Solution {
    public String reverseVowels(String s) {
        int i = 0,j = s.length()-1;
        char arr[] = s.toCharArray();
        while(i < j){
            if(!isVowel(arr[i])) i++;
            if(!isVowel(arr[j])) j--;
            if(isVowel(arr[i]) && isVowel(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}