import java.util.*;

public class SortedUniquePermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Set<String> resultSet = new TreeSet<>(); // TreeSet auto-sorts and removes duplicates
        boolean[] used = new boolean[input.length()];

        permute("", input, used, resultSet);

        System.out.println("Unique sorted permutations:");
        for (String perm : resultSet) {
            System.out.println(perm);
        }

        scanner.close();
    }

    static void permute(String prefix, String str, boolean[] used, Set<String> result) {
        if (prefix.length() == str.length()) {
            result.add(prefix); // add only complete permutations
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (used[i]) continue; // skip already used characters

            used[i] = true;
            permute(prefix + str.charAt(i), str, used, result);
            used[i] = false; // backtrack
        }
    }
}
