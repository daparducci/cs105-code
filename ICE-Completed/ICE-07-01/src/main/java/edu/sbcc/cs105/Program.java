package edu.sbcc.cs105;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws Exception {
        
        Wallet wallet = new Wallet(13);

        int iteration = 0;

        while(wallet.getAmountRemaining() > 0){

            iteration++;

            int amount = wallet.take(5);

            System.out.printf("%d : Removed $%d from the wallet. " +
                "Amount remaining is $%d%n", 
                iteration, 
                amount, 
                wallet.getAmountRemaining());

        }

        
    }
}