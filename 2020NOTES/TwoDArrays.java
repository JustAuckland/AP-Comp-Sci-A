
/**
 * Write a description of class NOtes here.
 *
 * @author Auck
 * @version 1/7/20
 */
public class TwoDArrays{
    int[] array = new int[10];
    int[][] tdArray = new int[10][10];
    int[][] otherArr = new int[5][10];
    int[][][][][][][][][][] tenD;
    // int[r][c] = row-major format alway
    public TwoDArrays(){
        tdArray[0][3] = 1;
        tdArray[1][3] = 4;
    }
    public void numberAllCells(){
        int num = 1;
        for(int r = 0; r < tdArray.length; r++){
            for(int c = 0; c < tdArray[0].length; c++){
                tdArray[r][c] = num;
                num++;            
            }
        }
    }
    public int addAllNumbers(){
        //this is an example with an ENHANCED for loop
        //Enhanced for loops CANNOT be used to CHANGE values in an array
        int total = 0;
        for(int[] oneArr: tdArray){
            for(int num : oneArr){
                total += num;
                
            }
        }
    }
}
