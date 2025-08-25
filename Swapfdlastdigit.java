package javawork;

/*Swap first and last digit of a number
Input: 4589
Output: 9584*/

public class Swapfdlastdigit {

	public static void main(String[] args) {

		int o = 666568;

		int k = o % 10;

		int fd = o;

		while (fd >= 10) {

			fd = fd / 10;

		}

		System.out.println(k);
		System.out.println(fd);

		System.out.println(k + "6656" + fd);
	}
}
