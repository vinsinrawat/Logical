package core.java.logical;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReverseUsingJava8 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(a);
	}

	public static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		Object[] rev = IntStream.rangeClosed(1, a.length).mapToObj(i -> a[a.length - i]).toArray();
		System.out.println(Arrays.toString(rev));
	}

}
