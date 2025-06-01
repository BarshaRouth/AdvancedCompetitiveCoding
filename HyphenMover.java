public class HyphenMover {

    public static String moveHyphensToFront(String input) {
        StringBuilder hyphens = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch == '-') {
                hyphens.append(ch);
            } else {
                others.append(ch);
            }
        }

        return hyphens.append(others).toString();
    }

    public static void main(String[] args) {
        String input = "move-this-to-front";
        String result = moveHyphensToFront(input);
        System.out.println("Result: " + result);
    }
}
