import java.util.Arrays;
import java.util.Comparator;

public class NaturalSortOrder {
    public static void main(String[] args) {
        String[] files = {"file2", "file10", "file1"};

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return extractNumber(a) - extractNumber(b);
            }

            int extractNumber(String s) {
                String num = s.replaceAll("\\D", ""); // Remove all non-digits
                return Integer.parseInt(num);
            }
        });

        System.out.println(Arrays.toString(files));
    }
}