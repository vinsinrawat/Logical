package core.java.logical;

public class ReverseAString {

	public static void main(String[] args) {
		String input = "vinod";
		System.out.println("Before Reverse: " + input);
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println("After Reverse: " + output);
	}

}
