public class BulbSwitch {

    // Function to find the number of bulbs that remain ON
    public static int bulbSwitch(int n) {
        // The number of perfect squares up to n is the square root of n
        return (int) Math.sqrt(n);
    }

    // Driver code
    public static void main(String[] args) {
        int n = 25; // Example: Number of bulbs
        System.out.println("Number of bulbs ON after toggling: " + bulbSwitch(n));
    }
}
