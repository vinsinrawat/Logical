package core.java.logical;

public class FibonacciByRecursion {

	static int a = 0, b = 1, c = 0;

	public static void main(String[] args) {
		int no = 10;
		FibonacciByRecursion ob = new FibonacciByRecursion();
		ob.printFib(no);
	}

	public void printFib(int no) {
		if (no >= 1) {
			System.out.print(a + " + ");
			c = a + b;
			a = b;
			b = c;
			printFib(no - 1);
		}
	}

}
