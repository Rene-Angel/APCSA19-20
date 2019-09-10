
/**
 * Write a description of class GuessGame here.
 *
 * @author Rene-Angel Jaime
 * @version (8.29.19)
 */
import java.lang.Math;
import java.util.Scanner;

public class GuessGame
{
    public static void main(String[] args)
    {
        double num = Math.random()*10;
        int guesses = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number!");
        while (guesses<=10){
            int guess = scan.nextInt();
            if (guess==num){
                System.out.println("You got it! The number was "+num+".");
            } else if (guess > num){
                System.out.println("Guess Lower!");
                guesses--;
            } else if (guess < num){
                System.out.println("Guess Higher!");
                guesses--;
            }
            if (guesses==0){
                System.out.println("Sorry, the number was "+num+".");
            }
        }
    }
}
