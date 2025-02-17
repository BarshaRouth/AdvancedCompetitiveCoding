import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegmentedSieve{

    // Function to find all prime numbers up to 'limit' using Sieve of Eratosthenes
    public static List<Integer> simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1]; // Boolean array to mark primes
        for (int i = 0; i <= limit; i++) {
            isPrime[i] = true; // Initially, assume all numbers are prime
        }

        // Mark non-prime numbers (multiples of each prime)
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false; // Mark multiples as non-prime
                }
            }
        }

        // Store prime numbers in a list
        List<Integer> primes = new ArrayList<>();
        for (int p = 2; p <= limit; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }
        return primes;
    }

    // Function to generate prime numbers up to sqrt(high)
    public static List<Integer> generatePrimes(int high) {
        int limit = (int) Math.sqrt(high) + 1; // Find square root of high
        return simpleSieve(limit); // Get primes up to sqrt(high)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input range [low, high] from user
        System.out.print("Enter the lower bound: ");
        int low = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int high = sc.nextInt();
        sc.close();
        
        // Generate small prime numbers up to sqrt(high)
        List<Integer> primes = generatePrimes(high);
        
        // Boolean array to mark numbers in the given range as prime
        boolean[] dummy = new boolean[high - low + 1];
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] = true; // Assume all numbers are prime initially
        }
        
        // Mark multiples of known primes as non-prime in range [low, high]
        for (int prime : primes) {
            // Find the first multiple of 'prime' in the range [low, high]
            int firstMultiple = (low / prime) * prime;
            if (firstMultiple < low) {
                firstMultiple += prime;
            }
            
            // Ensure we don't mark prime numbers themselves
            int start = Math.max(firstMultiple, prime * prime);
            
            // Mark all multiples of 'prime' as non-prime
            for (int j = start; j <= high; j += prime) {
                dummy[j - low] = false;
            }
        }
        
        // Print all prime numbers in the range [low, high]
        for (int i = low; i <= high; i++) {
            if (dummy[i - low]) {
                System.out.print(i + " ");
            }
        }
    }
}
