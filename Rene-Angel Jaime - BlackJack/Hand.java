
/**
 * @author Rene-Angel Jaime
 * @version (9.17.19)
 */
import java.lang.Math;

public class Hand
{
    int card;
    public Hand(){
        card +=  (int)(Math.random() *11) +1;
        card +=  (int)(Math.random() *11) +1;
    }
    public void hit(){
         card +=  (int)(Math.random() *11) +1;
    }
    int getCard(){
        return card;
    }
}
