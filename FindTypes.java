package week2.day1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// Declare the String

		String test = "$$ Welcome to 2nd Class of Automation $$";
		// Declare the following
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;

		// Convert String to Char
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {

				letter = letter + 1;

			} else if (Character.isDigit(charArray[i])) {
				num = num + 1;
			} else if (Character.isSpaceChar(charArray[i])) {
				space = space + 1;
			} else {
				specialChar = specialChar + 1;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("num: " + num);
		System.out.println("specialChar: " + specialChar);

	}

}
