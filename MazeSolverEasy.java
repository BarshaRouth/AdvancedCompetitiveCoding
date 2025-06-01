// Maze Solver - Short and Easy Version
public class MazeSolverEasy {
    
    static int N; // Size of the maze (N x N)

    // Function to check if moving to (x, y) is safe
    static boolean isSafe(int[][] maze, int x, int y) {
        // Safe if inside maze boundaries and the cell is not blocked (1 means path)
        return (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1);
    }

    // Function to solve the maze using Backtracking
    static boolean solveMaze(int[][] maze, int x, int y, int[][] path) {
        // Base Case: If destination (bottom-right) is reached
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            path[x][y] = 1; // Mark destination as part of path
            return true;    // Solution found
        }

        // Check if current move is safe
        if (isSafe(maze, x, y)) {
            path[x][y] = 1; // Mark current cell as part of solution path

            // Move Down
            if (solveMaze(maze, x + 1, y, path)) 
                return true;

            // Move Right
            if (solveMaze(maze, x, y + 1, path)) 
                return true;

            // If neither down nor right worked, BACKTRACK
            path[x][y] = 0; // Remove the cell from path
        }

        return false; // No solution from this path
    }

    public static void main(String[] args) {
        // Given Maze: 1 means path, 0 means blocked
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        N = maze.length; // Set the maze size
        int[][] path = new int[N][N]; // To store the path (solution)

        // Try solving from (0,0) start
        if (solveMaze(maze, 0, 0, path)) {
            // If solution exists, print the path
            for (int[] row : path) {
                for (int cell : row)
                    System.out.print(cell + " ");
                System.out.println();
            }
        } else {
            // If no solution
            System.out.println("No path found");
        }
    }
}
