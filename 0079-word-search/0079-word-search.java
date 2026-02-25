class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean isVis[][] = new boolean[n][m];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(dfs(board,word,i,j,n,m,0,isVis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word,
                   int i, int j, int n, int m,
                   int idx, boolean[][] isVis){

    // FIRST check complete match
    if(idx == word.length()) return true;

    // THEN check boundaries + visited + mismatch
    if(i < 0 || i >= n || j < 0 || j >= m ||
       isVis[i][j] || board[i][j] != word.charAt(idx)){
        return false;
    }

    isVis[i][j] = true;

    boolean found =
        dfs(board,word,i+1,j,n,m,idx+1,isVis) ||
        dfs(board,word,i-1,j,n,m,idx+1,isVis) ||
        dfs(board,word,i,j+1,n,m,idx+1,isVis) ||
        dfs(board,word,i,j-1,n,m,idx+1,isVis);

    isVis[i][j] = false;   // BACKTRACK

    return found;
}
}