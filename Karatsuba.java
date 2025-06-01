import java.io.*;

public class Karatsuba {
    public static long karatsubaMultiply(long x, long y) {
        // Base case: If x or y is a single-digit number, multiply directly
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Determine the number of digits
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (n + 1) / 2; // Split the digits roughly in half

        // Split x into a and b, y into c and d
        long a = x / (long) Math.pow(10, half);
        long b = x % (long) Math.pow(10, half);
        long c = y / (long) Math.pow(10, half);
        long d = y % (long) Math.pow(10, half);

        // Recursive multiplication
        long ac = karatsubaMultiply(a, c);
        long bd = karatsubaMultiply(b, d);
        long adbc = karatsubaMultiply(a + b, c + d) - ac - bd;

        // Final computation using Karatsuba formula
        return (long) (ac * Math.pow(10, 2 * half) + adbc * Math.pow(10, half) + bd);
    }

    public static void main(String[] args) {
        long x = 1234;
        long y = 5678;
        long product = karatsubaMultiply(x, y);
        System.out.println("Product: " + product);  // Expected Output: 3264
    }
}
