
/**
 * Write a description of class BlackJack here.
 *
 * @author Auckland V.
 * @version 9/17/19
 */
import java.util.Scanner;
public class BlackJack{
    public static void main(){
        boolean game = true;
        
        Hand myHand = new Hand(0, "", true);
        Hand dealerHand = new Hand(0, "", false);
        
        myHand.hit();
        dealerHand.hit();
        myHand.hit();
        dealerHand.hit();
        
        
        while (game){    
            break;
        }
    }
} 
