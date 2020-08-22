package core.java.logical;

public class PrimeNo {

	public static void main(String[] args) {
		int no = 11;
		int temp = 0;

		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}

		if (temp == 0) {
			System.out.println(no + " is Prime No");
		} else {
			System.out.println(no + " is Not Prime No");
		}
	}

}
