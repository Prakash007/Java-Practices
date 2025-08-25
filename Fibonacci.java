package javawork;

public class Fibonacci {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;

		int k = 10;

		for (int j2 = 0; j2 < k; j2++) {

			System.out.print(i + " ");

			int m = i + j;

			i = j;

			j = m;

		}

	}

}
