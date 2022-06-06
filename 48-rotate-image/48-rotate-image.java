class Solution {
    public void rotate(int[][] matrix) {
        int temp [][] = new int [matrix.length][matrix[0].length];
        int g = matrix.length -1;
        for(int i =0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                temp[i][j] = matrix[g][j];
            }
            g--;
        }
        for(int i =0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = temp[j][i];
            }
        }
    }
}