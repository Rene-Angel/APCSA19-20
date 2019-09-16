
/**
 * Write a description of class Lucky7s here.
 *
 * @author Rene-Angel Jaime
 * @version (9.13.19)
 */
import java.lang.Math;
public class Lucky7s
{
    /*
     * You start with $15. To play the game, you must wager $1. Two dice are then
     * rolled. If the result is the number 7, gain $5. Otherwise,
     * you do not earn any money. Automatically play this game until you run
     * out of money.
     * At the end of the game, the program states:
     * "You lost all your money in X rounds", where X is the number of
     * rounds that you played.
     */
    
    public static void Lucky7s()
    {
        System.out.println("Welcome to Lucky Sevens!.");
        int money = 15;
        int rolls = 0;
        while (money > 0){
            int d1 = (int)(Math.random() *6 + 1);
            int d2 = (int)(Math.random() *6 + 1);
            int total = d1 + d2;
            money--;
            rolls++;
            System.out.println("Round: "+rolls);
            System.out.println("Money: $"+money);
            if (total == 7){
                money +=5;
                System.out.println("You got $5. :)");
            } else if (total != 7){
                System.out.println("Sad chance. :(");
            }
        }
        System.out.println("You lost all your money in "+rolls+" rounds.");
    }
}
