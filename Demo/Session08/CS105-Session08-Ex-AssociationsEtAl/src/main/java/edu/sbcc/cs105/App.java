package edu.sbcc.cs105;

import edu.sbcc.cs105.Association.Consumable;
import edu.sbcc.cs105.Association.GutHealth;
import edu.sbcc.cs105.Association.Human;
import edu.sbcc.cs105.Composition.Account;
import edu.sbcc.cs105.Composition.Application;
import edu.sbcc.cs105.Composition.ApplicationDecision;
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
        int exampleId = 4;

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

        Human bob = new Human(GutHealth.Good);

        System.out.printf("Bob's initial gut health is %s%n", bob.getGutHealth());

        Consumable antibiotics = new Consumable("Antibiotics");
        bob.eat(antibiotics);
        bob.eat(antibiotics);
        bob.eat(antibiotics);
        bob.eat(antibiotics);
        bob.eat(antibiotics);

        System.out.printf("Bob's gut health is %s%n", bob.getGutHealth());
        Consumable yogurt = new Consumable("Yogurt");
        for (int i = 0; i < 10; i++){
            bob.eat(yogurt);
        }
        System.out.printf("Bob's gut health is %s%n", bob.getGutHealth());
    }

    private static void doCompositionExample(){

        
        Bank bank = new Bank();

        Application accountApp = new Application("Joe Gaucho", 600, 5000);


        ApplicationDecision decision = bank.applyForAccount(accountApp);

        if (decision.getDecision() == ApplicationReviewDecision.Approved){

            Account account = bank.getAccount(decision.getAccountNumber());
            System.out.printf("Congratulations! You've opened an account with us. Your balance is %.2f%n", account.getBalance());
        } else{

            System.out.printf("Sorry you've been denied.  Reason is %s : %d%n", decision.getDenyReason(), decision.getApp().getFicoScore());
        }

    }
}
