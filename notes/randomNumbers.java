
/**
 * Write a description of class Notes4 here.
 *
 * @author Auckland V
 * @version 8/29/19
 */
import java.lang.Math;
//import java.util.Random; DO NOT USE THIS CLASS!!!!!!
public class randomNumbers{
    public static void main(String[] args){
        double num = Math.random()*10;
        int newNum = (int) num + 1;
        System.out.println(newNum);
    }
    public static void main2(String[] args){
        double num = Math.random()*44 + 27; //there are 44 numbers between 27 and 70
        int newNum = (int) num + 1;
        System.out.println(newNum);
    }
}
