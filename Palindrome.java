package javawork;

public class Palindrome {

	public static void main(String[] args) {

		long i = 12345678987654321l;

		String str = Long.toString(i);

		String rev = "";

		int count = 0;

		for (int j = str.length() - 1; j >= 0; j--) {

			rev = rev + str.charAt(j);

			count++;

		}

		System.out.println(i);

		if (str.equals(rev)) {
			System.out.println("It is a palindrome number ");
		} else {
			System.out.println("Not a palindrome");
		}

	}
}
