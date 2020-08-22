package core.java.logical;

public class GreaterThree2 {

	public static void main(String[] args) {
		int a = 160, b = 40, c = 80;

		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
	}

}
