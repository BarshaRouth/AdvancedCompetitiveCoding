public class RemainderTheorem {
    public static void main(String[] args) {
        int[] divisor = {5, 7}; // Divisors (mod values)
        int[] rem = {1, 3}; // Remainders
        int num = 0; // Start from 0
        int i = 0; // Multiplier
        
        while (true) {
            num = divisor[0] * i + rem[0]; // Generate possible x values
            i++; // Increment multiplier
            
            boolean flag = true;
            for (int j = 1; j < divisor.length; j++) {
                if (num % divisor[j] != rem[j]) {
                    flag = false; // If condition fails, break and try next number
                    break;
                }
            }
            
            if (flag) { // If all conditions are met, print result and exit
                System.out.println("The smallest number satisfying the conditions is: " + num);
                break;
            }
        }
    }
}
