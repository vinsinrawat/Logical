package core.java.logical;

public class GreaterThree1 {

	public static void main(String[] args) {
		int a = 60, b = 40, c = 80;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			} else {
				System.out.println("c is greater");
			}
		} else if (b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
	}

}
