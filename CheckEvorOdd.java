package javawork;

/*Check if the sum of first and last digit of a number is even or odd
Input: 4532
Output: First digit: 4, Last digit: 2, Sum: 6, Even*/

public class CheckEvorOdd {

	public static void main(String[] args) {

		int i = 4532;

		int ld = i % 10;

		int fd = i;

		while (fd >= 10) {

			fd = fd / 10;

		}

		System.out.println("Last digit = " + ld);
		System.out.println("First digit = " + fd);

	}
}