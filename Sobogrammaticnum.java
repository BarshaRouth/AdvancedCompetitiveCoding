public class Sobogrammaticnum {
    public static boolean isSobogrammatic(String number) {
        String rotated = "";

        for (char c : number.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                case '8':
                    rotated += c;
                    break;
                case '6':
                    rotated += '9';
                    break;
                case '9':
                    rotated += '6';
                    break;
                default:
                    return false; // Invalid character for a sobogrammatic number
            }
        }

        return new StringBuilder(rotated).reverse().toString().equals(number);
    }

    public static void main(String[] args) {
        String number = "66899";
        if (isSobogrammatic(number)) {
            System.out.println(number + " is a Sobogrammatic number.");
        } else {
            System.out.println(number + " is not a Sobogrammatic number.");
        }
    }
}
