package core.java.logical;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "peek";
		String s2 = "keep";
		System.out.println(checkAnagram(s1, s2));
	}

	public static boolean checkAnagram(String s1, String s2) {
		boolean flag = true;

		// check length of two string
		if (s1.length() != s2.length()) {
			return false;
		}

		// convert two string into character array
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		// sort character array
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		// compare sorted character array
		flag = Arrays.equals(ch1, ch2);
		return flag;
	}

}
