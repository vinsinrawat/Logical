package core.java.logical;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2028;
		if ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 10)) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is Not Leap Year");
		}
	}

}
