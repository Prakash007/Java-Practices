package javawork;

/*Reverse the digits of a number and calculate the sum of even digits only
Input: 48291
Output: Reversed: 19284, Sum of even digits: 14*/

public class RevandCal {

	public static void main(String[] args) {

		int i = 48291;

		int even = 0;

		String rev = "";

		String s = String.valueOf(i);

		while (i != 0) {

			int k = i % 10;

			if (k % 2 == 0) {

				even = even + k;

			}

			rev = rev + k;

			i = i / 10;

		}

		System.out.println("Reversed number  " + rev);
		System.out.println("Sum if even number " + even);

	}

}
