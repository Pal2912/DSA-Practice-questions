class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        solve(0, board, solutions, n);
        return solutions;
    }
    
    private void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            // Convert the board into a list of strings and add to solutions
            solutions.add(constructSolution(board));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q'; // Place the queen
                solve(row + 1, board, solutions, n); // Recurse for the next row
                board[row][col] = '.'; // Backtrack and remove the queen
            }
        }
    }
    
    private boolean isSafe(char[][] board, int row, int col, int n) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }
    
    private List<String> constructSolution(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
}
