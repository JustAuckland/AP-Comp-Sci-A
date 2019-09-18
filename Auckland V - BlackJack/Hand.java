
/**
 * Write a description of class BlackJack here.
 *
 * @author Auckland V.
 * @version 9/17/19
 */
public class Hand{
    private int value;
    private String suit;
    private int card1;
    private int card2;
    
    public Hand(int value, String suit, int card1, int card2){
        this.value = value;
        this.suit = suit;
        this.card1 = card1;
        this.card2 = card2;
    }
    public int getValue(){
        return value;
    }
    public void hit(int value){
        double num = Math.random() * 10 + 2;
        int hitValue = (int) num;
        
        value += hitValue;
        getValue();
        System.out.println("The card you drew was a" + hitValue);
    }
    public void deal(int value){
        for(int t = 0; t < 2; t++){
            double num = Math.random() * 10 + 2;
            int addValue = (int)num;
            
            value += addValue;

        }
    }
}
