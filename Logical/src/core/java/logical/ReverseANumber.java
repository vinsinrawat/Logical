package core.java.logical;

public class ReverseANumber {

	public static void main(String[] args) {
		int no, rem, rev = 0;
		no = 12345;

		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reversed Number: " + rev);
	}

}
