package core.java.logical;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String input = "vinod ravi arun niraj karun arun niraj rahul pintoo";
		Set<String> set = new HashSet<String>();
		Set<String> dupSet = new HashSet<String>();

		String[] words = input.split(" ");

		for (String word : words) {
			boolean isAdded = set.add(word);

			if (!isAdded) {
				dupSet.add(word);
			}
		}
		System.out.println("Duplicate Word: " + dupSet);
	}

}
