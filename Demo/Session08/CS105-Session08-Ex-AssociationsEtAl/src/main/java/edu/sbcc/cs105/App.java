package edu.sbcc.cs105;

import edu.sbcc.cs105.Composition.Account;
import edu.sbcc.cs105.Composition.Application;
import edu.sbcc.cs105.Composition.ApplicationDecision;
import edu.sbcc.cs105.Composition.ApplicationReview;
import edu.sbcc.cs105.Composition.ApplicationReviewDecision;
import edu.sbcc.cs105.Composition.Bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int exampleId = 1;

        if (exampleId == 1){
            doAssociationEx1();
        }
        else if (exampleId == 2){
            doAggregationEx();
    
        } else if (exampleId == 3){
            doAggregationEx();
        } else{ 
            doCompositionExample();
        }

        
    }

    private static void doAssociationEx1() {

    }

    private static void doAssociationEx2() {

    }

    private static void doAggregationEx(){

    }

    private static void doCompositionExample(){

        Bank bank = new Bank();

        Application accountApp = new Application("Joe Gaucho", 300, 5000);

        ApplicationDecision decision = bank.applyForAccount(accountApp);

        if (decision.getDecision() == ApplicationReviewDecision.Approved){

            Account account = bank.getAccount(decision.getAccountNumber());
            System.out.printf("Congratulations! You've opened an account with us. Your balance is %.2f%n", account.getBalance());
        } else{

            System.out.printf("Sorry you've been denied.  Reason is %s : %d%n", decision.getDenyReason(), decision.getApp().getFicoScore());
        }

    }
}
