
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
        int moolah = 15;
        int rolls = 0;
        int d1 = (int)(Math.random() *6);
        int d2 = (int)(Math.random() *6);
        while (moolah > 0){
            moolah--;
            rolls++;
            if (d1+d2=7)
            
        }
    }
}
