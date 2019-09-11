
/**
 * Write a description of class guessGame here.
 *
 * @author Auckland V.
 * @version 9/9/19
 */
import java.lang.Math;
import java.util.Scanner;
public class guessGame{
    public static void main(String[] args){
        double num = Math.random()*10 + 1;
        int randomNum = (int) num;
        System.out.println("("+ randomNum +")");
        int guesses = 5;
        
        while (guesses > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("guess sum");
            int guess = scanner.nextInt();
            if (guess == randomNum){
                System.out.println("You did it!");
                break;
            }else{
                if (guess < randomNum){
                    System.out.println("guess higher");
                }else{
                    System.out.println("guess lower");
                }
            }
            guesses --;
            System.out.println("guesses left " + guesses);
        }
    }
}
