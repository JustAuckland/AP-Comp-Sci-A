
/**
 * Write a description of class Notes3 here.
 *
 * @author Auckland V.
 * @version 8/28/19
 */
public class Notes3{
    public static final double PI = 3.14;
    int gaucamole = 17;
    
    public static void main(){
        
    }
    
    /*List of operators:
     * + (Addition)
     * % (Modulus)
     * - (Subtaction)
     * * (Multiplication)
     * = (Assignment)
     * > (Greater than)
     * < (Less than)
     * >= (Greater than or equal to)
     * <= (Less than or equal to)
     * && (AND)
     * || (OR)
     * ++ (Increment)
     * __ (Decrement)
     * / (Division)
     * ! (NOT)
     * +=
     * -=
     * *=
     * /=
     * %=
     * == (Primitive equality)
     * != (Primitive inequality)
     */
    public static void equality(){
        int a = 5;
        int b = 5;
        System.out.print("This is true");
        System.out.println(a==b);//True or False "question"
        System.out.println();
        
        String c = "this";
        String d = "this";
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
    
    public static void mystery(){
        int a = 5;
        int b = 0;
        System.out.println(a/b);
    }
    public static int round(double number){
        return (int) (number + 0.5); 
    }
}


