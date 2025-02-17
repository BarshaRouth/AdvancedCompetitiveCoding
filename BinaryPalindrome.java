class BinaryPalindrome {
    public static void main(String[] args) {
        int x = 9; // Example number
        String binary = Integer.toBinaryString(x);
        
        // Efficient way to reverse a string
        String reversedBinary = new StringBuilder(binary).reverse().toString();

        // Check if palindrome
        if (binary.equals(reversedBinary)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
