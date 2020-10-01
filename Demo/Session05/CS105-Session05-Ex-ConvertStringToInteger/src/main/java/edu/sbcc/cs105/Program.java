package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a FICO score (300 - 850");
    
    String scoreAsString = input.nextLine();

    System.out.println("Enter your income");   
    int score = Integer.parseInt(scoreAsString);
    System.out.printf("The FICO Score was %d", score);

    String incomeAsString = input.nextLine();
    double income = Double.parseDouble(incomeAsString);
    System.out.printf("The income was was %d", income);

}

}
