/**
 * @author Rene-Angel Jaime
 * @version (10.15.19)
 */
import java.util.Scanner;
public class Notes
{
    int[] newArray = new int[100];
    Scanner[] scannerArray = new Scanner[40];
    // This only works if you Declare AND INITIALIZE on the same line
    int[] newArray2 = {5,3,6,8,45,21,7};
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
    public Notes()
    {
        newArray[0] = 5;
        newArray[1] = 9;
        newArray[2] = 7;
        newArray[3] = 8;
    }
    public void changeNums()
    {
        newArray2[5] = 9001;
    }
    public void printArray()
    {
        for(int i = 0; i < newArray2.length; i++){
            System.out.println(newArray2[i]);
        }
    }
}