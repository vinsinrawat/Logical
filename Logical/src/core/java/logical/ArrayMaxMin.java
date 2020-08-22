package core.java.logical;

public class ArrayMaxMin {

	public static void main(String[] args) {
		int[] arr = { 52, 47, 84, 65, 32, 11, 57, 85 };
		findMax(arr);
		findMin(arr);
	}

	public static void findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("MAX: " + max);
	}

	public static void findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("MIN: " + min);
	}

}
