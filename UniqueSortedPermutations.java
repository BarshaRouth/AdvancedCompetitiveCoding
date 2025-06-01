import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSortedPermutations {
    public static void main(String[] args) {
        String str = "aab";
        List<String> result = getPermutations(str);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> getPermutations(String str) {
        List<String> res = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // ensure sorted order
        boolean[] used = new boolean[chars.length];
        backtrack(chars, new StringBuilder(), used, res);
        return res;
    }

    private static void backtrack(char[] chars, StringBuilder current, boolean[] used, List<String> res) {
        if (current.length() == chars.length) {
            res.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // Skip already used characters
            if (used[i]) continue;

            // Skip duplicates
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);
            backtrack(chars, current, used, res);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}