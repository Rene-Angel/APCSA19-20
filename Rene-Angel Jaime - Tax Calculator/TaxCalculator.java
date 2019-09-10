
/**
 * @author Rene-Angel Jaime
 * @version (8.26.19)
 */

import java.util.Scanner;

public class TaxCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gross Income: ");
        int gross = scan.nextInt();
        String line1 = scan.nextLine();
        System.out.println("Dependents: ");
        int depend = scan.nextInt();
        int TaxableIncome = gross - 10000 - (2000 * depend);
        
        System.out.println("The taxable income is: ");
        System.out.println(TaxableIncome);
        int IncomeTax= TaxableIncome *= .20;
        System.out.println("The income tax is: ");
        System.out.println(IncomeTax);
               
        
    }
}
