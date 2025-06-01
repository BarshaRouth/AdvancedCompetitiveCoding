import java.util.HashSet;
import java.util.Set;

public class WeightedSubstrings {
    public static int countUniqueSubstrings(String P, String Q, int K) {
        Set<String> uniqueSubstrings = new HashSet<>();
        int[] weights = new int[26];
        // Create weight map
        for (int i = 0; i < 26; i++) {
            weights[i] = Q.charAt(i) - '0';// Q[i] is a character digit, like '3' 
        }
        int n = P.length();

        // Generate substrings
        for (int i = 0; i < n; i++) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < n; j++) {
                char ch = P.charAt(j);
                sum += weights[ch - 'a'];

                if (sum > K) break; // Exceeds allowed weight

                sb.append(ch);
                uniqueSubstrings.add(sb.toString());
            }
        }

        return uniqueSubstrings.size();
    }
    public static void main(String[] args) {
        String P = "abc";
        String Q = "12345678901234567890123456"; // weights for a-z
        int K = 4;

        int result = countUniqueSubstrings(P, Q, K);
        System.out.println("Total Unique Substrings with weight ≤ " + K + ": " + result);
    }
}
