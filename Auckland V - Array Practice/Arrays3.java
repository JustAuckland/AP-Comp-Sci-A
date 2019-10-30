
/**
 * Write a description of class Arrays3 here.
 *
 * @author Auckland V.
 * @version 10/30/19
 */
public class Arrays3{
    public static void main(){
        //Challenge 1
        //Create an array of doubles (20 numbers)
        double[] doubleArray = {346.5,44.87,354.3,378.9,523,1854,154,654,654,154.56,324,54,354,654,54.679,654,645,354,
            654.567,654};
        
        //Challenge 2
        //Find the sum of all the elements in the array
        double total = 0;
        for(int i = 0; i < doubleArray.length; i++){
            total += doubleArray[i];
        }
        System.out.println(total);
        
        //Challenge 3
        //Calculate the average numbers in the array
        double average = total /= doubleArray.length;
        System.out.println(average);
        
        //Challenge 4
        //Find the largest value in the array
        double largest = Integer.MIN_VALUE;
        for(int i = 0; i < doubleArray.length; i++){
            if (largest < doubleArray[i]){
                largest = doubleArray[i];
            }
        }
        System.out.println(largest);
        
        //Challenge 5
        //Find the smallest value in the array
        double smallest = Integer.MAX_VALUE;
        for(int i = 0; i < doubleArray.length; i++){
            if (smallest > doubleArray[i]){
                smallest = doubleArray[i];
            }
        }
        System.out.println(smallest);
    }
}
