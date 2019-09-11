
/**
 * Write a description of class Tax_Calculator here.
 *
 * @author Auckland V.
 * @version 1
 */
import java.util.Scanner;
public class Tax_Calculator{
    public static void sayIt(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in your gross income : ");
        double grossIncome = scanner.nextInt();
        
        System.out.print("Type in your number of dependents : ");
        int numDependents = scanner.nextInt();
        
        double taxableIncome = ((grossIncome - 10000)-(2000 * numDependents));
        double incometax = taxableIncome * .20;
        
        if (incometax >= 0){
            System.out.println("");
            System.out.print("Your income tax is: " + incometax);
        } else {
            System.out.println("");
            System.out.print("You're very poor and your income tax is 0");
        }
    }
}