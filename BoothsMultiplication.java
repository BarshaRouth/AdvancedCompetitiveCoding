public class BoothsMultiplication {
    static int multiply(int M, int Q) {
        int A = 0, Q_1 = 0;
        int n = 4; // Number of bits

        for (int i = 0; i < n; i++) {
            int Q0 = Q & 1;

            if (Q0 == 1 && Q_1 == 0) {
                A = A - M;
            } else if (Q0 == 0 && Q_1 == 1) {
                A = A + M;
            }

            // Arithmetic Right Shift [A Q Q-1]
            int temp = (A << 5) | (Q << 1) | Q_1;
            temp = temp >> 1;
            A = temp >> 5;
            Q = (temp >> 1) & 0b1111;
            Q_1 = temp & 1;
        }

        return (A << 4) | Q; // Final result
    }

    public static void main(String[] args) {
        int M = -3; // Multiplicand
        int Q = 2;  // Multiplier
        int result = multiply(M, Q);
        System.out.println("Result: " + result);
    }
}
