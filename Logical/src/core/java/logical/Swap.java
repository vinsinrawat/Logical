package core.java.logical;

public class Swap {

	public static void main(String[] args) {
		int a = 20, b = 60;
		System.out.println("Before Swapping: a value: " + a + " and b value: " + b);
		a = a + b; // 20+60=80
		b = a - b; // 80-60=20
		a = a - b; // 80-20=60
		System.out.println("After Swapping: a value: " + a + " and b value: " + b);
	}

}
