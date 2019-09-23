
/**
 * Write a description of class BlackJack here.
 *
 * @author Auckland V.
 * @version 9/17/19
 */
public class Hand{
    private int value = 0;
    private String suit;
    private int cardAmount = 0;
    private boolean hand;
    
    public Hand(int value, String suit, boolean hand){
        this.value = value;
        this.suit = suit;
        this.hand = hand;
    }
    public int getValue(){
        return value;
    }
    public void hit(){
        double num = Math.random() * 10 + 2;
        int hitValue = (int) num;        
        
        value += hitValue;
        getValue();
        System.out.println("The card you drew was " + hitValue);
    }
}

