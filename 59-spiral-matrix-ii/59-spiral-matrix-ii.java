class Solution {
public int[][] generateMatrix(int n) {
int[][] ans = new int[n][n];

    int x_start = 0;
    int x_end = n-1;
    
    int y_start = 0;
    int y_end = n-1;
    int curr = 1;
    
    while(x_start <= x_end || y_start <= y_end){
        
        
        for(int i=x_start;i<=x_end;i++){
            ans[y_start][i] = curr;
            curr++;
        }
        
        y_start++;
        
        for(int i=y_start;i<=y_end;i++){
            ans[i][x_end] = curr;
            curr++;
        }
        
        x_end--;
        
        for(int i=x_end;i>=x_start;i--){
            ans[y_end][i] = curr;
            curr++;
        }
        
        y_end--;
        
        for(int i=y_end;i>=y_start;i--){
            ans[i][x_start] = curr;
            curr++;
        }
        
        x_start++;
    }
    
    return ans;
}
}