//longest palindromic substring

//Expand around center....and mirror way


public class LongestPalindrome {

    // Main method to test the function
    public static void main(String[] args) {
        String s = "babad";  // Input string
        System.out.println("Longest Palindromic Substring is: " + longestPalindrome(s));
    }

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; // Edge case: return empty if string is null or empty

        int start = 0;  // Start index of the longest palindrome
        int end = 0;    // End index of the longest palindrome

        // Iterate through each character as the center of potential palindrome
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // Case 1: Odd length palindrome (center at i)
            int len2 = expandFromCenter(s, i, i + 1); // Case 2: Even length palindrome (center between i and i+1)
            int len = Math.max(len1, len2);           // Choose the longer one

            // Update start and end if we found a longer palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;  // Calculate new start index
                end = i + len / 2;          // Calculate new end index
            }
        }

        // Return the substring from start to end + 1
        return s.substring(start, end + 1);
    }

    // Helper method to expand around center and return the length of the palindrome
    private static int expandFromCenter(String s, int left, int right) {
        // Expand as long as the characters on both sides match and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;   // Move left pointer to the left
            right++;  // Move right pointer to the right
        }

        // Return the length of the palindrome found
        return right - left - 1; // Subtract 1 because the last left-- and right++ went one step too far
    }
}
