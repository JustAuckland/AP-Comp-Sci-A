
/**
 * Write a description of class ReplaceAll here.
 *
 * @author Auckland V
 * @version 10/22/19
 */
public class ReplaceAll{
    public static String apcsReplaceAll(String str, String oldStr, String newStr){
        String str2 = str;
        int psn =  str2.indexOf(oldStr);
        while (psn >= 0){
            String before = str2.substring(0, psn);
            String after = str2.substring(psn + oldStr.length());
            str2 = before + newStr + after;
            psn = str2.indexOf(oldStr, psn + 1);
        }
        return str2;
    }
    
    public static void main(){
        System.out.println("This should say '2 be or not 2 be'");
        System.out.println(apcsReplaceAll("to be or not to be","to","2"));
        System.out.println();
        
        System.out.println("This should say 'advanced calculus'");
        System.out.println(apcsReplaceAll("advanced calculus","math","science"));
        System.out.println();
        
        System.out.println("This should say 'gonegonegone'");
        System.out.println(apcsReplaceAll("gogogo","go","gone"));
        System.out.println();
        
        System.out.println("This should say 'baa'");
        System.out.println(apcsReplaceAll("aaaaa","aaa","b"));
        System.out.println();
    }
}
