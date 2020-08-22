package core.java.logical;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {
		String input = "vinodsingh";
		char[] chars = input.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		
		System.out.println(map);
	}

}
