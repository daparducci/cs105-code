package edu.sbcc.cs105;

import java.math.BigInteger;

public class Program {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		float f = 6.02E+23f;

		BigInteger bi =  new BigInteger("5645824165431646345456465465464646464" 
		+ "54222465456465465465465464655615851564281246");

		BigInteger numToAdd = new BigInteger("1");

		bi = bi.add(numToAdd);
		

		System.out.println(bi.toString());

		try {

			// Create a big integer from the largest possible long value
			long biggestLong = Long.MAX_VALUE;
			bi = new BigInteger(String.valueOf(biggestLong));

			// Add one to the value
			bi =bi.add(new BigInteger("1"));

			// Try to reconvert to long - should throw arithmetic exception because we have exceed the maximum range of long
			long myNumber = bi.longValueExact();

			System.out.printf("The value is %d%n", myNumber);

		} catch (ArithmeticException ex) {
			
			System.out.println(ex.getMessage());
		}

	}

}
