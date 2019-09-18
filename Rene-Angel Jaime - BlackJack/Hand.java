
/**
 * @author Rene-Angel Jaime
 * @version (9.17.19)
 */
import java.lang.Math;

public class Hand
{
    int sum;
    public Hand(){
        sum +=  (int)(Math.random() *11) +1;
        sum +=  (int)(Math.random() *11) +1;
    }
    public void hit(){
        sum +=  (int)(Math.random() *11) +1;
        
    }
    int getSum(){
        return sum;
    }
}
