package javawork;

public class CountNmbr {

	public static void main(String[] args) {

		long i = 4646648448885413215l;

		String s = Long.toString(i);

		int count = 0;

		for (int j = 0; j < s.length(); j++) {

			s.charAt(j);
			count++;

		}
		System.out.println(count);
	}

}