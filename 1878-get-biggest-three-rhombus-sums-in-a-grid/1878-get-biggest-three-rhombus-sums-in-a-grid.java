class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                for(int k = 0;k<Math.max(n, m);k++){
                    if(i - k < 0 || i + k >= n || j - k < 0 || j + k >= m) break;

                    int temp = 0;

                    if(k == 0) temp = grid[i][j];
                    else{
                        temp = grid[i-k][j] + grid[i][j-k] + grid[i+k][j] + grid[i][j+k];

                        for(int l = 1;l < k;l++){
                            temp += grid[i + l][j + k - l];
                            temp += grid[i + l][j - k + l];
                            temp += grid[i - l][j + k - l];
                            temp += grid[i - l][j - k + l];
                        }
                    }
                    set.add(temp);
                    if(set.size() > 3){
                        set.pollFirst();
                    }
                }
            }
        }
       
        int size = set.size();
         int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = set.pollLast();
        }
        return arr;
    }
}