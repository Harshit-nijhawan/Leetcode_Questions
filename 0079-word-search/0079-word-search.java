class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == word.charAt(0))
                    if(dfs(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int i ,int j,int l){
        if(l == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(l)) return false;
        char c = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(board,word,i+1,j,l+1) ||
                        dfs(board,word,i,j+1,l+1) ||
                        dfs(board,word,i-1,j,l+1) ||
                        dfs(board,word,i,j-1,l+1);

        board[i][j]= c;
        return found;

    }
}