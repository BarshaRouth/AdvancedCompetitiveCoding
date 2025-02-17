public class BoyerMooreAlgoForMAjorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 2, 2, 2, 2, 2, 1};
        int majorityElement = findMajorityElement(arr);
        if (isMajority(arr, majorityElement)) {
            System.out.println("Majority Element is: " + majorityElement);
        } else {
            System.out.println("No Majority Element found");
        }
    }

    private static int findMajorityElement(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}