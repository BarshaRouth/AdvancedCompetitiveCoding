public class CombinationGenerator {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int r = 2;
        generateCombinations(arr, r, 0, new int[r]);
    }
    static void generateCombinations(int[] arr, int r, int start, int[] current) {
        if (r == 0) {
            // If r elements are picked, print current combination
            for (int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current[current.length - r] = arr[i];
            generateCombinations(arr, r - 1, i + 1, current);
        }
    }
}
