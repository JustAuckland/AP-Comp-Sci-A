public class Notes2{
    private static int b = 10;
        
    public static void main(String[] args){
        int a;
        a = 15;
        System.out.println("Hello World!");
    }
    
    public static void changeNums(){
        System.out.println(b);
        b++;
        System.out.println(b);
        b--;
        System.out.println(b);
        b*= 2;
        System.out.println(b);
        b %=2; //Mod
    }
}
