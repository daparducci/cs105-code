package edu.sbcc.cs105.Composition;

public class Account {

    private final String accountNumber;
    private final String name;
    private boolean isClosed;
    private double balance;

    Account(final String accountNumber, final String name, double startingBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        balance = startingBalance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

	public void close() {
        isClosed = true;
    }
    
    public void debit(double amount) throws Exception {
        if (isClosed){
            throw new Exception("Cannot debit a closed account");
        }
        
        if (balance - amount < 0){
            throw new Exception("Overdraft exception");
        }
        balance -= amount;
    }

    public void credit(double amount) throws Exception {
        if (isClosed){
            throw new Exception("Cannot debit a closed account");
        }
        
        balance += amount;
    }

	public double getBalance() {
		return balance;
	}

}
