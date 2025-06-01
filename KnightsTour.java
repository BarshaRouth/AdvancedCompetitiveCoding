
public class KnightsTour {
    static int N;

    // All 8 possible moves for a knight
    static int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};

    // Print the solution
    static void printSolution(int[][] sol) {
        for (int[] row : sol) {
            for (int cell : row)
                System.out.printf("%2d ", cell);
            System.out.println();
        }
    }

    // Check if (x, y) is a valid move
    static boolean isSafe(int x, int y, int[][] sol) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Recursive function to solve the Knight's Tour
    static boolean solveKTUtil(int x, int y, int movesValue, int[][] sol) {
        if (movesValue == N * N)
            return true;

        for (int k = 0; k < 8; k++) {
            int nextX = x + moveX[k];
            int nextY = y + moveY[k];

            if (isSafe(nextX, nextY, sol)) {
                sol[nextX][nextY] = movesValue;
                if (solveKTUtil(nextX, nextY, movesValue + 1, sol))
                    return true;
                else
                    sol[nextX][nextY] = -1; // backtrack
            }
        }
        return false;
    }

    static void solveKT(int size) {
        N = size;
        int[][] sol = new int[N][N];

        // Initialize all cells as unvisited
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                sol[i][j] = -1;

        // Starting from first block
        sol[0][0] = 0;

        if (!solveKTUtil(0, 0, 1, sol)) {
            System.out.println("Solution does not exist");
        } else {
            printSolution(sol);
        }
    }

    public static void main(String[] args) {
        solveKT(5); // try 5, 6, 8...
    }
}
