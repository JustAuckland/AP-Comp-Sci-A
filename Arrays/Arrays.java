
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Arrays
{
    int[] newArray = new int[100];
    Scanner[] scannerArray = new Scanner[40];
    
    //This only works if you DECLARE AND INITIALIZE
    //on the same line
    int[] newArray2 = {5, 3, 6, 8, 45, 21, 7};
    public static void main(String[] args){
        System.out.println("Hello World");
        
    }
    public Arrays(){
        newArray[0] = 5;
        newArray[1] = 9;
        newArray[2] = 7;
        newArray[3] = 8;
        
    }
    public void changeNums(){
        newArray2[5] = 9001;
    }
    public void printArray(){
       for(int i = 0; i < newArray.length; i++){
           System.out.println(newArray2[i]);
       }
    }
}
