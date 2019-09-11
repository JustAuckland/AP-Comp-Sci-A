
/**
 * Write a description of class ControlStatements here.
 *
 * @author Auckland V
 * @version 1
 */
import java.lang.Math;
public class Controlstatements{
    public static String grade(int percentage){
        if (percentage >= 90){
            return "A";
        }
        else if(percentage >=80 && percentage < 90){
            return "B";
        }
        return "F";
        // Here is the OR operator: ||
        
    }
    public static void main(){
        String letter = grade(97);
        System.out.println(letter);
    }
}