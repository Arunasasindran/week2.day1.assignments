package week2.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// declare String as madam
		String palindrome = "madam";
		// declare another String as null
		String rev = "";

		// convert string into char array
		char[] str = palindrome.toCharArray();

		// get the length of the String
		int length = palindrome.length();

		// print the length of the String
		System.out.println("The length of the String palindrome is " + length);

		// iterate the string in the reverse order
		for (int i = length - 1; i >= 0; i--) {
			// add the char to String rev
			rev = rev + str[i];

		}
		// compare String palindrome and rev
		if (rev.equalsIgnoreCase(palindrome)) {
			System.out.println("The String "+palindrome+" is palindrome");
		} else
			System.out.println("The String "+palindrome+" is not palindrome");
	}

}
