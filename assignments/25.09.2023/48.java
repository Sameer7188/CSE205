class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int colm = matrix[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<row/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row-1-j];
                matrix[i][row-1-j] = temp;
            }
        }
    }
}