
class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board,0,0);
    }
    static boolean solve(char[][] board,int row,int col){
        if(row == 9){
            return true;
        }
        if(col == 9){
            return solve(board,row+1,0);
        }
        if(board[row][col] == '.'){
            return solve(board,row,col+1);
        }
        
        if(isSafe(board,row,col)){
            if(solve(board,row,col+1)){
                 return true;
             }
        }

            return false;
    }

    static boolean isSafe(char[][] board,int row,int col){
        char c = board[row][col];
        // for row
            for(int j=0;j<board.length;j++){
                if(board[j][col]==c && j != row){
                    return false;
                }
            }

        // for colum
        for(int i=0;i<board.length;i++){
            if(board[row][i] == c && i != col){
                return false;
            }
        }

        // for box
        int a = (col/3)*3;
        int b = (row/3)*3;
        for(int i=b;i<b+3;i++){
            for(int j=a;j<a+3;j++){
                if(board[i][j] == c && (i != row || j != col)){
                    return false;
                }
            }
        }
        return true;
    }
}