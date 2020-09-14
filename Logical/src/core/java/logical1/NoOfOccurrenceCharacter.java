package core.java.logical1;

import java.util.Scanner;

public class NoOfOccurrenceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int initialLength = str.length();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the character to find the occurrence: ");
		String str1 = sc1.next();
		str = str.replace(str1, "");
		int finalLength = str.length();
		System.out.println("Total Number of Occurrence of character "+str1+" is "+(initialLength-finalLength));
	}
}
