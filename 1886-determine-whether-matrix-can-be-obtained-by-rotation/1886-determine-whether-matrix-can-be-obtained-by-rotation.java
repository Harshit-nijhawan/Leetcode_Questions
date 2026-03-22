class Solution {
    int n;

    public boolean findRotation(int[][] mat, int[][] target) {
        n = mat.length;

        for(int c = 0; c < 4; c++) {
            if(isEqual(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }

    // ✅ FULL matrix comparison
    public boolean isEqual(int[][] mat, int[][] target) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // ✅ Rotate 90° clockwise
    public void rotate(int[][] mat) {
        // Step 1: Transpose
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while(left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}