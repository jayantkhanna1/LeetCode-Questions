class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(true){
            if (i == matrix.length || j < 0)
                return false;
            else if(target < matrix[i][j]){
                j--;
            }
            else if(target > matrix [i][j])
                i++;
            else
                return true;            
        }
    }
}