package javawork;

/* public class HowmanyTimes {

	public static void main(String[] args) {

		int g = 55555555;

		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		int i6 = 0;
		int i7 = 0;
		int i8 = 0;
		int i9 = 0;

		String s = Integer.toString(g);

		for (int i = 0; i < s.length(); i++) {

			int o = Character.getNumericValue(s.charAt(i));

			if (o == 2) {
				i2++;
			}
			if (o == 3) {
				i3++;
			}
			if (o == 4) {
				i4++;
			}
			if (o == 5) {
				i5++;
			}
			if (o == 6) {
				i6++;
			}
			if (o == 7) {
				i7++;
			}
			if (o == 8) {
				i8++;
			}
			if (o == 9) {
				i9++;
			}

		}
		System.out.println("2 num " + i2 + " times");
		System.out.println("3 num " + i3 + " times");
		System.out.println("4 num " + i4 + " times");
		System.out.println("5 num " + i5 + " times");
		System.out.println("6 num " + i6 + " times");
		System.out.println("7 num " + i7 + " times");
		System.out.println("8 num " + i8 + " times");
		System.out.println("9 num " + i9 + " times");

	}

} */

public class HowmanyTimes {
	public static void main(String[] args) {
		int g = 55555555;

		// Array index = digit, value = count
		int[] count = new int[10];

		String s = Integer.toString(g);

		for (int i = 0; i < s.length(); i++) {
			int digit = Character.getNumericValue(s.charAt(i));
			count[digit]++;
		}

		// Print only 2 to 9
		for (int d = 1; d <= 9; d++) {
			System.out.println(d + " num " + count[d] + " times");
		}
	}
}
