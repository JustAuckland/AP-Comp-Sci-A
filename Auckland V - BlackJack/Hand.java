
/**
 * Write a description of class BlackJack here.
 *
 * @author Auckland V.
 * @version 9/17/19
 */
public class Hand{
    private int value = 0;
    private int card1;
    private int card2;
    
    public Hand(){
        card1 = hit();
        card2 = hit();
    }
    public int getValue(){
        return value;
    }
    public int hit(){
        double num = Math.random() * 10 + 2;
        int hitValue = (int) num;      
        value += hitValue;
        return hitValue;
        
    }
}

