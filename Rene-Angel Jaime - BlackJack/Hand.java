
/**
 * @author Rene-Angel Jaime
 * @version (9.17.19)
 */
import java.lang.Math;

public class Hand
{
    public int card1;
    public int card2;
    public int total;
    public int hitCard;
    public Hand(){
        card1 += (int)(Math.random() *11) +1;
        card2 += (int)(Math.random() *11) +1;
        total = card1 + card2; 
    }
    public int hit(){
        hitCard = (int)(Math.random() *11) +1;
        total += hitCard;
        return total;
    }
}
