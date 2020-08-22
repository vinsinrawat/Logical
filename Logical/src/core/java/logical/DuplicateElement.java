package core.java.logical;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] arr = { 15, 96, 35, 47, 35, 66, 87, 74, 96 };
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (set.add(arr[i]) == false) {
				System.out.println("Duplicate Element: " + arr[i]);
			}
		}
	}

}
