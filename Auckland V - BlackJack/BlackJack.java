
/**
 * Write a description of class BlackJack here.
 *
 * @author Auckland V.
 * @version 9/17/19
 */
import java.util.Scanner;
public class BlackJack{
    public static void main(){
        int youBusted = 0;
        int dealBusted = 0;
        
        Hand myHand = new Hand();
        Hand dealerHand = new Hand();
        
        System.out.println("Your hand total is " + myHand.getValue());
        
        String hitCard = "yes";
        Scanner hit = new Scanner(System.in);
        while (hitCard.equals("yes") && myHand.getValue() <= 21){
            System.out.println("Do you want to hit?");
            hitCard = hit.nextLine();
            if (hitCard.equals("yes")){
                System.out.println("You got a " + myHand.hit());
                System.out.println("Your total is " + myHand.getValue());
            }
            if (myHand.getValue() > 21){
                System.out.println("Oh no! You busted, you lose!");
                youBusted ++;
            }
        }
        if (myHand.getValue() <= 21){
            System.out.println("The dealer's total is " + dealerHand.getValue());
            while (dealerHand.getValue() < 17){
                System.out.println("The dealer drew a " + dealerHand.hit());
                System.out.println("The dealer's total is " + dealerHand.getValue());
                if (dealerHand.getValue() > 21){
                    System.out.println("Ha Ha the dealer busted, He lost!");
                    dealBusted ++;
                }
            }
        }
        if (youBusted == 0 && dealBusted == 0){
            if (myHand.getValue() >= dealerHand.getValue()){
                System.out.println("Your total was " + myHand.getValue());
                System.out.println("The dealer's total was " + dealerHand.getValue());
                System.out.println("You win! :D");
            }else{
                System.out.println("Your total was " + myHand.getValue());
                System.out.println("The dealer's total was " + dealerHand.getValue());
                System.out.println("You lose D:");
            }
        }
    }
} 
