package week2.day1.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		// initiate int variable to get the count

		int count = 0;
		String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				count = count + 1;
			}

		}
		System.out.println("The occurence of letter e is " + count);
	}

}
