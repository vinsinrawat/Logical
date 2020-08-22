package core.java.logical;

import java.util.Arrays;

public class ArrayReverseWithoutAdditionalArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		reverse(a);

	}

	public static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		int start = 0;
		int middle = a.length / 2;
		int end = a.length - 1;
		int temp = 0;

		for (; start < middle; start++, end--) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
