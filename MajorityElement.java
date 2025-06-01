public class MajorityElement {
    
    // **Optimized Boyer-Moore Voting Algorithm**
    public static int majorityElementBoyerMoore(int[] nums) {
        int candidate = 0, count = 0;

        // Finding the majority candidate
        for (int num : nums) {
            if (count == 0) {  // If count becomes zero, pick a new candidate
                candidate = num;
                count = 1;
            } else if (candidate == num) {  // If same as candidate, increase count
                count++;
            } else {  // Otherwise, decrease count
                count--;
            }
        }
        return candidate;  // The majority candidate (assuming it exists)
    }

    // **Brute Force Approach (Nested Loops)**
    public static int majorityElementBruteForce(int[] nums) {
        int majorityCount = 0;
        int majorityElement = 0;

        // Compare each element with all others to count occurrences
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            // Update majority element if count is highest so far
            if (count > majorityCount) {
                majorityCount = count;
                majorityElement = nums[i];
            }
        }

        // Ensure the found element is a majority (> n/2 times)
        if (majorityCount > nums.length / 2) {
            return majorityElement;
        }
        return -1;  // No valid majority element found
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 3, 3, 4, 3};

        // Using the Boyer-Moore algorithm (optimized)
        System.out.println("Majority Element (Boyer-Moore): " + majorityElementBoyerMoore(nums));

        // Using the Brute Force approach
        System.out.println("Majority Element (Brute Force): " + majorityElementBruteForce(nums));
    }
}
