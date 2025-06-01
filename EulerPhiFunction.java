public class EulerPhiFunction {
    public static int phi(int n) {
        int result = n; // Initialize result as n

        for (int p = 2; p * p <= n; p++) {
            // Check if p is a prime factor of n
            if (n % p == 0) {
                // If yes, update n and result
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p;
                // result -= result / p;
            }
        }

        // If n has a prime factor greater than sqrt(n)
        if (n > 1) {
            result -= result / n;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(phi(9));  // Output: 6
        System.out.println(phi(10)); // Output: 4
    }
}
