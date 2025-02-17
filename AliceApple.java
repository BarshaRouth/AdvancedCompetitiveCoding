import java.util.Scanner;

public class AliceApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for M, S, K, E, and W
        System.out.print("Enter values for M, S, K, E, W: ");
        int M = scanner.nextInt(); // Total required value
        int S = scanner.nextInt(); // Some available value
        int K = scanner.nextInt(); // A multiplier
        int E = scanner.nextInt(); // Additional resource
        int W = scanner.nextInt(); // Another additional resource

        // Calculating results based on the conditions
        if (M <= S * K) {
            System.out.println(M);
        } else if (M <= S * K + E + W) {
            System.out.println(S * K + (M - S * K));
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}
