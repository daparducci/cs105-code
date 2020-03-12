package edu.sbcc.cs105;

/**
 * Simulates a wallet of money
 * 
 * @author kinneavy-j
 *
 */
public class Wallet {

	private int amountRemaining;
	
	/**
	 * 
	 * @param startingAmount The amount of money initially in the wallet
	 */
	public Wallet(int startingAmount) {
		amountRemaining = startingAmount;
	}
	
	/**
	 * Removes the specified amount from the wallet 
	 * or what is remaining if less than the amount specified
	 * @param amountToTake The amount of money to remove from the wallet
	 * @return The amount requested or the amount remaining if less than requested
	 */
	public int take(int amountToTake) {
        
        amountToTake = amountRemaining > amountToTake  
            ? amountToTake 
            : amountRemaining;

        amountRemaining -= amountToTake;

		return amountToTake;
		
	}

	public int getAmountRemaining() {
		return amountRemaining;
	}
}

