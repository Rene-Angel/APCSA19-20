/**
 * Write a description of class Ciphers here.
 *
 * @author Rene-Angel Jaime
 * @version February 20th, 2020
 */
import java.lang.Math;
public class Ciphers
{
    public static void caesar(int message, int shift){
        
    }
    public void printKey(){
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                        "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                        "w", "x", "y", "z"};
        for(int r=0; r<abc.length;r++){
            System.out.println(abc[r]);
            for(int c=0; c<abc.length;r++){
                System.out.print(abc[c]);
            }
        }
    }
}
