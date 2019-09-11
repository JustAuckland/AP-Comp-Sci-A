
/**
 * Write a description of class Loops here.
 *
 * @author Auckland V
 * @version 9/11/19
 */
public class Loops{
    public static void main1(){
        for (int row = 1; row < 6; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main2(){
        
    }
    public static void whileLoops(){
    int counter = 10;
    while (counter > 0){
        System.out.println("The count is " + counter );
        counter--;
    }
    }
}
