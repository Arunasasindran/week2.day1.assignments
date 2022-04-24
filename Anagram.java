package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Declare a String1
		String text1 = "stops";

		// Declare a String2
		String text2 = "potss";

		// check the length of both strings are same
		if (text1.length() == text2.length()) {
			char[] text3 = text1.toCharArray();
			char[] text4 = text2.toCharArray();
			Arrays.sort(text3);
			Arrays.sort(text4);
			for (int i = 0; i < text3.length; i++) {

				if (text3[i] == text4[i]) {
					System.out.println("both are same " + text3[i] + " = " + text4[i]);
				}
				else
				{
					System.out.println("both are not same " + text3[i] + " = " + text4[i]);
				}

			}

		}

	}

}
