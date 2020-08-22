package core.java.logical;

import java.util.Arrays;

public class ArrayReverseUsingAdditionalArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(a);
	}

	private static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}

		System.out.println(Arrays.toString(b));
	}

}
