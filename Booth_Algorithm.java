import java.util.Scanner;

class Booth_Algorithm {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int multiplicand = inp.nextInt();
		int multiplier = inp.nextInt();

		int product = 0;
		int multiplicandBits = Integer.toBinaryString(multiplicand).length();

		for (int i = 0; i < multiplicandBits; i++) {
			int currentBit = (multiplicand & 0b1);
			if (currentBit == 1) {
				product += multiplier;
			}
			multiplier <<= 1;
			multiplicand >>>= 1;
		}
		System.out.println(product);

		inp.close();
	}
}