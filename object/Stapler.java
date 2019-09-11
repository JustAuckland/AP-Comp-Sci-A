
/**
 * Write a description of class Stapler here.
 *
 * @author Auckland V.
 * @version 9/4/19
 */
public class Stapler{
    private String name;
    private int staplesLeft;
    private String color;
    private String brand;
    private String size;
    private boolean isElectric;
    private boolean isJammed;
    public Stapler(String name, int numOfStaples, String color, String brandName, 
    String size, boolean isElectric){
       this.name = name;
       isJammed = false;
       staplesLeft = numOfStaples;
       this.color = color;
       brand = brandName;
       this.size = size;
       this.isElectric = isElectric;
    }
    public Stapler(){
        name = "Stapler";
        isJammed = false;
        staplesLeft = 100;
        color = "Red";
        brand = "Swingline";
        isElectric = false;
        size = "Regular";
    }
    public Stapler(String brandName){
        this("Stapler", 100, "red", brandName, "regular", false);
    }
    public void staplerStuff(){
        System.out.println("You stapled the papers with the " + color + " stapler.");
        staplesLeft--;
        System.out.println("You have " + staplesLeft + " staples left");
    }
    public void toss(String name){
        System.out.println("You throw the stapler at " + name + ".");
        isJammed = true;
        System.out.println("The stapler is now broken");
    }
    public String getName(){
        return name;
    }
    public int numOfStaplesLeft(){
        return staplesLeft;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }
    public String getSize(){
        return size;
    }
    public boolean getIsElectric(){
        return isElectric;
    }
    public void changeName(String newName){
        name = newName;
    }
    public void refill(int staples){
        staplesLeft += staples;
    }
    public void newColor(String  color){
//        color = colorChange;
    }
}



