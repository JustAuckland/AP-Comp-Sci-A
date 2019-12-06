
/**
 * Write a description of class ExceptionNotes here.
 *
 * @author Auckland Van Saun
 * @version 11/13/19
 */
public class ExceptionNotes{
    public static boolean test (int y) throws Exception{
        if (y < 0){
            throw new Exception("Y is negative");
        }
        return true;
    }
}
