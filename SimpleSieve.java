import java.util.*;

// public class SimpleSieve {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();

//         boolean[] bool = new boolean[num + 1]; // Array size should be num + 1
//         Arrays.fill(bool, true); // Initialize all values to true

//         bool[0] = bool[1] = false; // 0 and 1 are not prime numbers

//         for (int i = 2; i * i <= num; i++) { // Correct loop condition
//             if (bool[i]) {
//                 for (int j = i * i; j <= num; j += i) { // j <= num to include upper bound
//                     bool[j] = false;
//                 }
//             }
//         }

//         System.out.println("List of prime numbers up to given number are:");
//         for (int i = 2; i <= num; i++) {
//             if (bool[i]) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

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
