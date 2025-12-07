class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        for(int arr[] : grid){
            List<Integer> list = new ArrayList<>();
            for(int val : arr){
                list.add(val);
            }
            map.put(list,map.getOrDefault(list,0)+1);
        }
        
        for(int i = 0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<n;j++){
                list.add(grid[j][i]);
            }
            if(map.containsKey(list)){
                count += map.get(list);
            }
            
        }
        return count;


        // int count = 0;
        // for(int i = 0;i<grid.length;i++){
        //     for(int j = 0;j<grid[0].length;j++){
        //         boolean isEqual = true;
        //         for(int k = 0;k<grid.length;k++){
        //             if(grid[i][k] != grid[k][j]) {
        //                 isEqual = false;
        //                 break;
        //             }
        //         }
        //         if(isEqual) count++;
        //     }
        // }
        // return count;
    }
}