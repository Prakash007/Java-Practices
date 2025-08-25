package javawork;

/*Find the product of all digits in a number
Input: 1234
Output: Product: 24*/

public class Product {

	public static void main(String[] args) {

		int g = 6554;

		int mul = 1;

		while (g != 0) {

			int k = g % 10;

			mul = mul * k;

			g = g / 10;

		}

		System.out.println(mul);
	}

}
