package javawork;

import java.util.Scanner;

public class AveSum {

	public static void main(String[] args) throws ArithmeticException {

		// addition using declared values

		int a = 0;
		int c = 45;
		int g = 34;
		int h = 2;
		int u = 87;

		int k = a + c + g + h + u;

		int avg = k / 5;

		System.out.println("Addition of given numbers :" + k);
		System.out.println("Average of given numbers :" + avg);

		///////////////////////////////////////////////

		// addition using scanner and getting inputs from console

		System.out.println("Enter the n number for addition : ");
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();

		int num = 5;
		int b2 = 1;
		int sum = 0;

		if (a1 <= 0) {
			System.out.println("Don't enter Zero and less than zero");
			scanner.close();
			return;
		}

		for (int i = 0; i < a1; i++) {

			// System.out.println("Entered number for addtion " + b2++ + " is");

			System.out.println("enter the number ");

			num = scanner.nextInt();
			// System.out.println("Entered number " + num);

			sum = sum + num;
		}

		scanner.close();

		int avg1 = sum / a1;

		System.out.println("Addition of all numbers is : " + sum);
		System.out.println("Average of all numbers is : " + avg1);

	}
}
