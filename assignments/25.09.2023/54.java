class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();
      int row = matrix.length;
      int col = matrix[0].length;
      int startR = 0;
      int startCol = 0;
      int i =0;
      if(row<1){
        return ans;
      }
        
      while(startR<row && startCol<col){
        for(i= startCol; i< col; ++i){
          ans.add(matrix[startR][i]);
        }
        startR++;
        for(i = startR; i<row;++i){
          ans.add(matrix[i][col-1]);
        }
        col--;
        if(startR<row){
          for(i = col-1; i>=startCol;--i){
            ans.add(matrix[row-1][i]);
          }
          row--;
        }
        if(startCol<col){
          for(i = row-1; i>=startR;--i){
            ans.add(matrix[i][startCol]);
          }
            startCol++;
          }
        }
      return ans;
    }
}