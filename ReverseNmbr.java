package javawork;

public class ReverseNmbr {

	public static void main(String[] args) {

		int i = 2255;

		int sum = 0;

		String str = "";

		while (i != 0) {

			int k = i % 10;

			sum = sum + k;

			str = str + k;

			i = i / 10;

		}

		System.out.println(sum);

		System.out.println("Reversed number " + str);
	}

}