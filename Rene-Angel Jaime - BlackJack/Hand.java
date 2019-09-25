
/**
 * @author Rene-Angel Jaime
 * @version (9.17.19)
 */
import java.lang.Math;

public class Hand
{
    private int card1;
    private int card2;
    private int total = 0;
    private int hitCard;
    private boolean bust;
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
    public boolean bust(){
        if (total > 21){
            bust = true;
        }
        return bust;
    }
    //Accessor Methods
    public int getCard1(){
        return card1;
    }
    public int getCard2(){
        return card2;
    }
    public int getHitCard(){
        return hitCard;
    }
    public int getTotal(){
        return total;
    }
    public boolean getBust(){
        return bust;
    }
}