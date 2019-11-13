
/**
 *
 * @author Rene-Angel Jaime
 * @version (9.4.19)
 */
public class Stapler
{
    private int staplesLeft; // AP calls these "private instance variables"
    private String color;
    private String brand;
    private String size;
    private boolean isElectric;
    private boolean isJammed;
    private String name;
    
    public Stapler(String name, int numOfStaples, String color, String brandName, // You can move this to...
    String size, boolean isElectric){                                             // the next line
        isJammed = false;
        staplesLeft = numOfStaples;
        this.color = color;
        brand = brandName;
        this.size = size;
        this.isElectric = isElectric;
        this.name = name;
    }
    public Stapler(){
        isJammed = false;
        staplesLeft = 100;
        color = "Red";
        brand = "Swingline";
        isElectric = false;
        size = "Regular";
        name = "Bob";
    }
    public Stapler(String brandName){
        this("Stapler", 100, "Red", brandName, "Regular", false);
    }
    public void stapleStuff(){
        System.out.println("You stapled the papers with the "+color+" stapler.");
        staplesLeft--;
        System.out.println("You have "+staplesLeft+" staples left.");
    }
    public void toss(String name){
        System.out.println("You throw the stapler at "+name+".");
        isJammed = true;
        System.out.println("The stapler is now broken");
    }
    //Accesor Methods
    public String getName(){
        return name;
    }
    public int numOfStaplesLeft(){
        return staplesLeft;
    }
    public String color(){
        return color;
    }
    public String brand(){
        return brand;
    }
    public String size(){
        return size;
    }
    //Mutator Methods
    public void changeName(String newName){
        name = newName;
    }
    public void changeColor(String newColor){
        color = newColor;
    }
}