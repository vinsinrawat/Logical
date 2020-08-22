package core.java.logical;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String input = "vinod singh rawat";
		System.out.println("Before Reverse: " + input);
		String output = "";
		String[] words = input.split(" ");

		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			output = output + revWord + " ";
		}
		System.out.println("After Reverse: " + output);
	}

}
