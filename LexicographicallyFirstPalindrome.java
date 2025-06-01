//Lexicographically means arranging words or characters in dictionary order

public class LexicographicallyFirstPalindrome {
    public static void main(String[] args) {
        // String str = "google";
        String str = "malayalam";
        System.out.println(firstPalindrome(str));
    }

    static String firstPalindrome(String str) {
        int[] cnt = new int[26]; // Frequency array for a-z
        char odd = 0;
        
        // Count frequency of each character
        for (char c : str.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        
        // Construct the palindrome
        for (int i = 0; i < 26; i++) {
            if ((cnt[i] & 1) == 1) {
                if (odd == 0) {
                    odd = (char) ('a' + i); // Store the first odd character
                }
            }
            for (int j = 0; j < cnt[i] / 2; j++) {
                firstHalf.append((char) ('a' + i));
            }
        }
        
        // Create the full palindrome
        secondHalf.append(firstHalf).reverse(); // Mirror the first half
        if (odd != 0) {
            firstHalf.append(odd); // Insert the odd character in the middle
        }
        firstHalf.append(secondHalf);
        
        return firstHalf.toString();
    }
}
