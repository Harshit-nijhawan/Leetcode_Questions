class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        int maxEdit = 3;
        for(int i = 0;i<queries.length;i++){
            String str1 = queries[i];
            for(int j = 0;j<dictionary.length;j++){
                int edit = 0;
                String str2 = dictionary[j];
                int p = 0;
                while(edit < maxEdit && p < str1.length()){
                    if(str1.charAt(p) != str2.charAt(p)){
                        edit++;
                    }
                    p++;
                }
                if(edit < 3 ) {
                    list.add(str1);
                    break;
                }
            }
        }
        return list;
    }
}