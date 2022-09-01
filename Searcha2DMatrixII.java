class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(target == matrix[i][0]){
                return true;
            }
            for(int j = 0; j < n; j++){
                // System.out.printf("matrix[%d][%d] : %d\n", i,j,matrix[i][j]);
                // if(target == matrix[j][0]){
                //     return true;
                // }
                // if(target == matrix[0][j]){
                //     return true;
                // }
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}