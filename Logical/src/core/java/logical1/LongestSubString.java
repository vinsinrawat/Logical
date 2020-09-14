package core.java.logical1;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcdab"; //abcd
		System.out.println(longest(str));
	}
	
	public static String longest(String str) {
		HashSet<Character> hs = new HashSet<>();
		String longestOverall = "";
		String longestTillnow = "";
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(hs.contains(ch)) {
				longestTillnow="";
				hs.clear();
			}
			
			hs.add(ch);
			longestTillnow += ch;
			
			if(longestTillnow.length() >longestOverall.length()) {
				longestOverall = longestTillnow;
			}
		}
		return longestOverall;
	}

}
