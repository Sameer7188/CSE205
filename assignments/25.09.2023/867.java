class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int colm = matrix[0].length;

        int[][] trans = new int[colm][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}