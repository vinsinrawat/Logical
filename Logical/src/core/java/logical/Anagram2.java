package core.java.logical;

public class Anagram2 {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcba";
		System.out.println(checkAnagram(s1, s2));
	}

	public static boolean checkAnagram(String s1, String s2) {
		boolean flag = true;

		// check length of two string
		if (s1.length() != s2.length()) {
			return false;
		}

		// take first character from first string and compare with all characters in
		// second string
		int found = 0;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			for (int j = 0; j < s2.length(); j++) {
				if (ch == s2.charAt(j)) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				flag = false;
				break;
			}
		}
		

		return flag;
	}

}
