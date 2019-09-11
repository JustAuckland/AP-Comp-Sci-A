
/**
 * Write a description of class Inputs here.
 *
 * @author Van Saun
 * @version 8.22.19
 */
import java.util.Scanner;
public class Inputs{
    /**This program will ask you for a phrase,
     * and it will repeat it back to you in
     * the terminal
     */
    public static void sayIt(String[] args){
        /*
         * This is a multi-line comment
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something!");
        String line1 = scanner.nextLine();
        System.out.println(line1);
        
        System.out.println("How old are you?");
        int line2 = scanner.nextInt();
        System.out.println(line2 + "?!?!?");
        System.out.println("You belong in a museum!");
        
        System.out.print("Last year, you were ");
        System.out.print(line2 - 1);
        System.out.print("year old.");
    }
    public static void recasting(){
        int number = 123; //DO NOT CHANGE!!!
        System.out.println("The last number is");
        System.out.println(number % 10);
    }
}
