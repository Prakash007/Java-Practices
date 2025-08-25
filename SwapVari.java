package javawork;

public class SwapVari {

	public static void main(String[] args) {

		int a = 3000;
		int b = 1000;

		System.out.println("Before Swap of A  " + a);
		System.out.println("Before Swap of B  " + b);

		int temp = a; // temp holds 3000

		a = b; // a holds 1000

		b = temp; // b holds 3000

		System.out.println("After Swap of A  " + a);
		System.out.println("After Swap of B  " + b);

	}

}
