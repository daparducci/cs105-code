package edu.sbcc.cs105.Composition;

import java.util.ArrayList;

/**
 * Bank
 */
public class Bank {

    private int nextAccountNumber = 1;

    private final ArrayList<Account> accounts = new ArrayList<>();

    public ApplicationDecision applyForAccount(final Application app) {

        ApplicationDecision result;

        if (app.getFicoScore() > 500){
            
            String accountNumber = String.format("%010d", nextAccountNumber);
            nextAccountNumber++;
            Account newAccount = new Account(accountNumber, app.getName(), app.getInitialDeposit());
            accounts.add(newAccount);

            result = new ApplicationDecision(ApplicationReviewDecision.Approved, accountNumber);

        } else{
            result = new ApplicationDecision(ApplicationReviewDecision.Denied, "Fico score too low", app);
        }

        return result;
    }

    public void closeAccount(String accountNumber){
        Account acct = getAccount(accountNumber);
        if (acct != null){
            acct.close();
        }
    }

    public Account getAccount(String accountNumber){

        Account result = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                result = account;
                break;
            }
        }

        return result;
    }

    public void closeBank(){
        for (Account account : accounts) {
            account.close();
        }
    }
}