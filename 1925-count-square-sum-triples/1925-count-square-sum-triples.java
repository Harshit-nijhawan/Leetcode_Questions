class Solution {
    public int countTriples(int n) {
        boolean square[] = new boolean[n * n + 1];
        int count = 0;
        for(int i = 1;i<=n;i++){
            square[i * i] = true;
        }

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
               int sum = i * i + j * j;

                if(sum <= n * n && square[sum]) {
                    count++;
                }
            }
        }
        return count;


        // ArrayList<Integer> ans = new ArrayList<>();
        // int count = 0;
        // for(int i = 1;i<=n;i++){
        //     ans.add(i * i);
        // }
        // for(int i = 0;i<ans.size();i++){
        //     for(int j = 0;j<ans.size();j++){
        //         for(int k = 0;k<ans.size();k++){
        //             if(ans.get(i)+ans.get(j) == ans.get(k)){
        //             count++;
        //         }
        //         }
                
        //     }
        // }
        // return count;
    }
}