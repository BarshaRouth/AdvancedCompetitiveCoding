import java.util.*;

public class SumDifference {
    public static int solve(int n, int[] a) {
        int posSum = 0, negSum = 0;
        
        for (int num : a) {
            if (num >= 0) {
                posSum += num;
            } else {
                negSum += num; // negative sum
            }
        }
        
        return posSum - negSum; // subtracting negative = adding its absolute value
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println(solve(n, a));
        sc.close();
    }
}
