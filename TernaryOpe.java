package javawork;
public class TernaryOpe {
	public static void main(String[] args) {
		int i = 56;
		int j = 444;
		int k = 66666;
		int max = (i > j) ? ((i > k) ? i : k) : ((j > k) ? j : k);
		System.out.println(max);
	}
}
