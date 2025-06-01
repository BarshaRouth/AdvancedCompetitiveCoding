import java.util.Scanner;

public class AliceApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs from the user
        System.out.print("Enter values for M (required red apples), K (red apples per South tree), N (North trees), S (South trees), W (West trees), E (East trees): ");
        int M = scanner.nextInt(); // Total red apples Alice needs
        int K = scanner.nextInt(); // Red apples per South tree
        int N = scanner.nextInt(); // North trees (irrelevant)
        int S = scanner.nextInt(); // South trees (each gives K red apples)
        int W = scanner.nextInt(); // West trees (each gives 1 red apple)
        int E = scanner.nextInt(); // East trees (each gives 1 red apple)

        scanner.close();

        int redFromSouth = S * K;                   // Step 1: Red apples from South trees

        if (M <= redFromSouth) {                    // South trees are enough
            System.out.println(M);
        } else if (M <= redFromSouth + E + W) {     // South + East + West trees are enough
            int extraNeeded = M - redFromSouth;
            System.out.println(redFromSouth + extraNeeded); // This equals M
        } else {
            System.out.println(-1);                 // Not enough red apples even with all trees
        }
    }
}
