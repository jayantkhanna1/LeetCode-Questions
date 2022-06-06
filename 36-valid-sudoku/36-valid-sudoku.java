class Solution {
    public boolean check(char temp[]){
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if( temp[i] != '.' && temp[i]==temp[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board) {
        char temp[]=new char [9];
        int g=0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.'){
                    for(int u=0;u<i;u++){
                        if(board[u][j] == board[i][j]){
                            return false;
                        }
                    }
                    for(int u=0;u<j;u++){
                        if(board[i][u] == board[i][j]){
                            return false;
                        }
                    }}
                    if(i%3==0 && j%3==0){
                        g=0;
                        for(int u=i;u<i+3;u++){
                            for(int v=j;v<j+3;v++){
                                temp[g]=board[u][v];     
                                g++;
                            }
                        }
                        if(check(temp)){
                            return false;
                        }
                    }
                
            }
        }
        return true;
    }
}