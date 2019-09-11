
/**
 * Write a description of class staplerRunner here.
 *
 * @author Auckland V.
 * @version 9/5/19
 */
public class staplerRunner{
    public static void mian(){
        Stapler myStapler = new Stapler();
        Stapler stapler2 = new Stapler("PaperPro");
        
        //this constructor does not exist

        //Stapler stapler3 = new Stapler(100);
        //System.out.println(myStapler.isJammed);
        myStapler.staplerStuff();
        myStapler.staplerStuff();
        stapler2.staplerStuff();
    }
}
