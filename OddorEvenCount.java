package javawork;

public class OddorEvenCount {

	public static void main(String[] args) {

		int i = 509813;

		String s = Integer.toString(i);

		int c = 0;
		int b = 0;

		for (int j = 0; j < s.length(); j++) {

			int o = Character.getNumericValue(s.charAt(j));

			System.out.println(o);

			if (o % 2 == 0) {
				c++;
			} else {
				b++;

			}
		}

		System.out.println("Number of Even Numbers : " + c);
		System.out.println("Number of Odd Numbers : " + b);

	}

}
