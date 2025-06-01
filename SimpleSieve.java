import java.util.*;

//Find Prime Numbers in a Given Range
public class SimpleSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range L and R: ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        boolean[] prime = new boolean[R + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= R; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= R; j += i) {
                    prime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers in range [" + L + ", " + R + "] are:");
        for (int i = Math.max(L, 2); i <= R; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


// Steps:

// Create a boolean array prime[] of size R + 1 (since arrays are 0-indexed and we want to include R).

// Initially assume all numbers are prime → set all entries as true.

// Set prime[0] and prime[1] to false because 0 and 1 are not prime.

// For each number i starting from 2 up to √R:

// If prime[i] is true, it is a prime.

// Mark all multiples of i starting from i*i to R as false because they are not prime.

// After this, all entries in the array that are still true represent prime numbers.
