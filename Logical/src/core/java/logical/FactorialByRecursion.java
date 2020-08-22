package core.java.logical;

public class FactorialByRecursion {

	static int fact = 1;
	public static void main(String[] args) {
		int no = 8;
		FactorialByRecursion ob = new FactorialByRecursion();
		ob.calcFact(no);
		System.out.println("Factorial of "+no+" is "+fact);
	}
	
	public void calcFact(int no) {
		if(no>=1) {
			fact = fact * no;
			calcFact(no-1);
		}
	}

}
