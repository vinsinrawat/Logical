package core.java.logical;

public class Armstrong {

	public static void main(String[] args) {
		int no, temp, total = 0;
		no = 370;
		int number = no;

		for (; number != 0; number /= 10) {
			temp = number % 10;
			total = total + temp * temp * temp;
		}

		if (total == no) {
			System.out.println(no + " is Armstrong number");
		} else {
			System.out.println(no + " is Not Armstrong number");
		}
	}

}
