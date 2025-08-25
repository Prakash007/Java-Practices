package javawork;

public class CharCheck {

	public static void main(String[] args) {

		char h = 't';

		if ((h >= 'a' && h <= 'z') || (h >= 'A' && h <= 'Z')) {

			char y = Character.toLowerCase(h);

			if ((y == 'a') || (y == 'e') || (y == 'i') || (y == 'o') || (y == 'u')) {
				System.out.println("Given char is a vowel " + y);
			} else {

				System.out.println("Given char is a consonant : " + y);
			}

		} else if ((h >= '0') && (h <= '9')) {
			System.out.println("It is a digit number " + h);
		}

		else {
			System.out.println("It is special character " + h);
		}

	}

}
