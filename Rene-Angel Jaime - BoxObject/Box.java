
/**
 * Write a description of class Box here.
 *
 * @author Rene-Angel Jaime
 * @version (9.6.19)
 */
public class Box
{
    private String color;
    private String size;
    private String name;
    private String type;
    private String brand;
    private boolean isOpen;
    private boolean isEmpty;
    
    public Box(String name, String color, String type, String brandName, String size, boolean isEmpty){
        isOpen = false;
        this.color = color;
        brand = brandName;
        this.size = size;
        this.isEmpty = isEmpty;
        this.type = type;
    }
    public Box(){
        
    }
}
