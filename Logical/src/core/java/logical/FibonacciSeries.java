package core.java.logical;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		int no = 15;
		int i = 0;
		while(i<=no) {
			System.out.print(a+" + ");
			c = a +b;
			a = b;
			b = c;
			i++;
		}
	}

}
