
/**
 * @author Rene-Angel Jaime
 * @version 8.22.19
 */

import java.util.Scanner;

public class Inputs
{
    /**This program will ask you for a phrase,
     * and it will repeat it back to you in
     * the terminal
     */
    public static void sayIt(String[] args){
        /*
         * This is a multi-line comment
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String line1 = scan.nextLine();
        System.out.println(line1);
        System.out.println("How old are you?");
        int line2 = scan.nextInt();
        System.out.println(line2 + "?!?!?!");
        System.out.println("You belong in a museum!");
        // couldn't we have used, System.out.print(String.format("Last year you were ... ?
        System.out.print("Last year, you were ");
        System.out.print(line2 - 1);
        System.out.print(" years old.");
    }
    public static void recasting(){
        int number = 123;
        System.out.print("The last number is ");
        System.out.println(number % 10 + ".");
    }
}