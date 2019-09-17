
/**
 * Write a description of class Lucky7s here.
 *
 * @author Auckland V
 * @version 9/12/19
 */
import java.lang.Math;
public class Lucky7s{
    public static void Sevens(){
        int rounds = 0;
        int money = 15;
        int mostMoney = 0;
        while (money != 0){
            double num1 = Math.random()*6 + 1;
            int dice1 = (int) num1;
            double num2 = Math.random()*6 + 1;
            int dice2 = (int) num2;
            int roll = dice1 + dice2;
            if (roll != 7){
                money --;
                System.out.println("");
                System.out.println("You lost the roll!");
                System.out.println("Money remaining " + money);
            }else{
                money += 4;
                System.out.println("");
                System.out.println("You won the roll!");
                System.out.println("Money remaining " + money);
            }
            rounds ++;
        }
        System.out.println("");
        System.out.println("You should stop gambling you're bad at this!");
        System.out.println("You lasted " + rounds + " rounds");
    }
}
