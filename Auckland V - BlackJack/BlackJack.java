
/**
 * Write a description of class BlackJack here.
 *
 * @author Auckland V.
 * @version 9/17/19
 */
import java.util.Scanner;
public class BlackJack{
    public static void main(){
        
        Hand myHand = new Hand();
        Hand dealerHand = new Hand();
        
        System.out.println("Do you want to hit?");
        //hit = scanner.nextln();
        while (myHand.getValue() < 21){
            System.out.println(myHand.getValue());
            System.out.println("You got a " + myHand.hit());
            System.out.println("Your total is " + myHand.getValue());
            if (myHand.getValue() > 21){
                System.out.println("Oh no! You busted");
            }
        }
        
        if (myHand.getValue() <= 21){
            while (dealerHand.getValue() < 17){
                System.out.println(dealerHand.getValue());
                System.out.println("The dealer drew a " + dealerHand.hit());
                System.out.println("The dealer's total is " + dealerHand.getValue());
            }
        }
        
    }
} 
