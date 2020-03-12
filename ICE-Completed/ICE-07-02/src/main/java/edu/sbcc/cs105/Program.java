package edu.sbcc.cs105;

import java.util.Random;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws Exception {
        
       SecuritySystem secSys = new SecuritySystem("12");
       int attempts = 0;

       Random rand = new Random();

       do{
           attempts++;

           int codeNumeric = rand.nextInt(50) + 1;

            String securityCode =  String.format("%02d", codeNumeric);

            secSys.disarm(securityCode);

            System.out.printf("%d: Code entered is %s. System is %s%n", 
                attempts,
                securityCode,
                secSys.getState().toString());

       } while (attempts < 50 && secSys.getState() == SystemState.Armed);
        
    }
}