package edu.sbcc.cs105;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean isRick;
        boolean isWalking;
        boolean isDead;
        boolean isZombie;

        isRick = false;
        isWalking = true;
        isDead = true;

        /*
        isRick = true;
        isWalking = false;
        isDead = true;
        */

        isZombie = !isRick && (isWalking || !isDead == false) && isDead;
        System.out.println(isZombie);

        isZombie = isRick || !isWalking || !isRick && isDead == false 
            && (isWalking || isDead);
        System.out.println(isZombie);
        
        isZombie = isWalking 
            || !isWalking 
            && (isWalking || isRick && isDead) 
            || !isRick && !isDead;
        System.out.println(isZombie);
        
    }
}
