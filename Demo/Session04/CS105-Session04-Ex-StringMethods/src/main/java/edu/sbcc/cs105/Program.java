package edu.sbcc.cs105;

public class Program {

	/**
	 * this this entry point
	 * @param args pass arguments from command line
	 */
	public static void main(String[] args) {


		String one = null;
		String two = "World";

		String result = one + " " + two;

		result = one.concat(" ").concat(two);

		

//		
		String dataString = "Hello The Java";
		int indexOfJ = dataString.indexOf("J");
		String badString = dataString.substring(indexOfJ, indexOfJ + 4);

		// Get length of data string
		//int len = len(dataString);

		int dataStringLength = dataString.length();
		System.out.printf("%s : %d", dataString, dataStringLength);

		boolean hEqualsH = "H".equalsIgnoreCase("h");

		boolean startsWithH = dataString.startsWith("Hel");	
		boolean startsWithh = dataString.startsWith("h");
		//dataString = dataString.toLowerCase();

		System.out.printf("%s starts with H = %b; starts with h = %b", 
			dataString, startsWithH, startsWithh);
	
		boolean endsWithX = dataString.endsWith("X");
		System.out.printf("%s ends with X = %b", 
			dataString, endsWithX);
	
		String dataStringUpper = dataString.toUpperCase();
		System.out.println(dataStringUpper);

		String dataStringLower = dataString.toLowerCase();
		System.out.println(dataStringUpper);
				
		// Get position of first space
		int indexOfSpace1 = dataString.indexOf(" ");

		// Starting at position after first space, get the position of the second space
		int indexOfSpace2 = dataString.indexOf(" ", indexOfSpace1 + 1);

		// Get the substring that starts in the next position after first space and ends at 
		// the position before the second space
		String secondWord = dataString.substring(indexOfSpace1 + 1, indexOfSpace2);
		System.out.println(secondWord);

		int length = secondWord.length();
		System.out.printf("The second word is %d characters long", length);

		int lastIndexof_e = dataString.lastIndexOf('e');
		System.out.printf("The last e occurs at index: %d", lastIndexof_e);

		

	}

}
