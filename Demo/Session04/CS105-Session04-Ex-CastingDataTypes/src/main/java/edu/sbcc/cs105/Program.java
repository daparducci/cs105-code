package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {


		final double CENTIMETERS_TO_INCHES = 2.54;
		final double AVOGADROS_NUMBER = 6.02E+23;
		
		byte a = 25;
		short s = 25;
		int i = 42 * 1000;

		i = s;

		int c = 410;
		
		a = (byte)i;
		System.out.printf("The value of converting byte %d to an int is %d%n", i, a);

		a = (byte)c;
		System.out.printf("The value of converting byte %d to an int is %d%n",c, a);
	
		
		
		float d = 42.0f;
		double myDoub = 42.0d;

		long l = 4000000000;

		double e = 1.0;
		double f = Double.MAX_VALUE;
		
		d = (float)e;
		System.out.printf("The value of converting double %f to a float is %f%n", e, d);
		
		d = (float)f;
		System.out.printf("The value of converting double %f to a float is %f%n", f, d);
		
		f = d;
	}

}
