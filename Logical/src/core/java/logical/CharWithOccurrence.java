package core.java.logical;

public class CharWithOccurrence {

	public static void main(String[] args) {
		String input= "opentext";
		char charToReplace = 't';
		//expected output = open1ex2
		
		//check char presence in String
		if(input.indexOf(charToReplace) == -1) {
			System.out.println("Given character Not available in Input String");
			System.exit(0);
		}
		
		//logic to replace char occurrence in String
		int count = 1;
		for(int i = 0; i<=input.length()-1; i++) {
			char ch = input.charAt(i);
			if(ch == charToReplace) {
				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(input);
	}

}
