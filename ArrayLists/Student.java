/**
 * Write a description of class Student here.
 *
 * @author Rene-Angel Jaime
 * @version (2.25.20)
 */
public class Student
{
    private String name;
    private int ID;
    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
}
