
/**
 * @author Rene-Angel Jaime
 * @version (9.17.19)
 */
import java.util.Scanner;
import java.lang.Math;

public class Game
{
    static Scanner input = new Scanner(System.in);
    static Hand player = new Hand();
    static Hand dealer = new Hand();
    public static void main(String[] args){
        while (player.getCard() < 21 && dealer.getCard() < 21){
            System.out.println("Your hand total is "+player.getCard()+".");
            System.out.println("Hit or Stand?: ");
            String playerInput = input.nextLine();
            if (playerInput.equals("hit")){
                player.hit();
            } else if (playerInput.equals("stand")){
                dealer.hit();
            }
        }
    }
}
