public class JosephusTrap{
    public static void main(String[] args) {
        int n = 7;  // total persons
        int k = 3;  // every kth person is killed
        int safePosition = josephus(n, k) + 1;  // +1 for 1-based indexing
        System.out.println("The safe position is: " + safePosition);
    }

    // Recursive Josephus Function (0-based)
    static int josephus(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (josephus(n - 1, k) + k) % n;
    }
}