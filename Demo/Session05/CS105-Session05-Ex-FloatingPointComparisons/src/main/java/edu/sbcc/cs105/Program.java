package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {


		double aa = 0.6 - (0.15 + 0.15);		
		double bb = 0.1 + 0.2;

		System.out.printf("aa == bb is %b using simple equality\n", aa == bb);
			
		double epsilon = 1E-10;
		boolean	areSame =  Math.abs(aa - bb) < epsilon;
		System.out.printf("aa == bb is %b using epsilon\n", areSame);

		int comparisonResult = Double.compare(aa, bb);
		System.out.println(comparisonResult);
		//areSame = comparisonResult == 0;
		//System.out.printf("aa == bb is %b using Double.compare\n", areSame);

	}

}
