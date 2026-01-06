class Solution {
    
    public boolean exist(char[][] board, String word) { 
        int n = board.length;
        int m = board[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    if(find(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public boolean find(char board[][],String word,int i,int j,int l) {
        if(l == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(l)) return false;
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found = find(board,word,i+1,j,l+1) ||
                        find(board,word,i,j+1,l+1) ||
                        find(board,word,i-1,j,l+1) ||
                        find(board,word,i,j-1,l+1);
        board[i][j] = temp;
        return found;
    }
}