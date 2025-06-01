public class NQueens {

    final int N;

    public NQueens(int n) {
        this.N = n;
    }

    // Print the board
    void printSolution(int[][] board) {
        for (int[] row : board) {
            for (int cell : row)
                System.out.print((cell == 1 ? "Q " : ". "));
            System.out.println();
        }
        System.out.println();
    }

    // Check if it's safe to place a queen at board[row][col]
    boolean isSafe(int[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Solve the N-Queens problem using backtracking
    boolean solveNQUtil(int[][] board, int row) {
        if (row == N) {
            printSolution(board);
            return true; // return true to print only one solution, false to print all
        }

        boolean res = false;

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                res = solveNQUtil(board, row + 1) || res; // try next row
                board[row][col] = 0; // backtrack
            }
        }

        return res;
    }

    // Wrapper to start solving
    void solve() {
        int[][] board = new int[N][N];
        if (!solveNQUtil(board, 0)) {
            System.out.println("No solution exists");
        }
    }

    public static void main(String[] args) {
        NQueens queenSolver = new NQueens(4); // try with 4, 5, 8, etc.
        queenSolver.solve();
    }
}
