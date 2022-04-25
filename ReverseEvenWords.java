package week2.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Declare the String
		String test = "I am a software tester";
		String[] splitString = test.split(" ");
		
		String rev ="";
		int odd =0;
		for (int i = 0; i<splitString.length; i++)
		{
			odd = i % 2;
			if(odd == 0) {
				//System.out.println(i);
				System.out.print(splitString[i] + " ");
				
			}
			else if (odd != 0)
			{
				//System.out.println(i);
				char[] reverse = splitString[i].toCharArray();
				for (int j=reverse.length-1; j>=0; j--)
				{
				
					rev = rev+reverse[j];
				}
				System.out.print(rev +" ");
				rev = "";
			}
		}

	}

}
