
/**
 * @author Rene-Angel Jaime
 * @version (8.27.19)
 */

import java.util.Scanner;

public class Celsius2Kelvin
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Celsius: ");
        int c = scan.nextInt();
        double k = c + 273.15;
        String line1 = scan.nextLine();
        System.out.println("Kelvin: ");
        System.out.print(k);
    }
}