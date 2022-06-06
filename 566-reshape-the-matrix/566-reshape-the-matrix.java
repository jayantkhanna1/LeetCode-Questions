class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int [n*m];
        int g=0;
        for(int i=0;i < m ; i++){
            for(int j=0;j < n ; j++){
                arr[g]=mat[i][j];
                g++;
            }
        }
        g=0;
        if(m*n != r*c){
            return mat;
        }
        int ans[][]=new int [r][c];
        for(int i=0;i < r ; i++){
            for(int j=0;j < c ; j++){
                ans[i][j] = arr[g];
                g++;
            }
        }
        return ans;
    }
}