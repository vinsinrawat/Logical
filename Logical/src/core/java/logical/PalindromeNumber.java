package core.java.logical;

public class PalindromeNumber {

	public static void main(String[] args) {
		int no, rem, rev = 0;
		no = 131;
		int temp = no;
		
		while(temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		
		if(no == rev) {
			System.out.println(no+" is Palindrome Number");
		}else {
			System.out.println(no+" is Not Palindrome Number");
		}
	}

}
