
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
        System.out.println("Welcome to BlackJack!");
        System.out.println("The Dealer shows their first card, "+dealer.card1+", and keeps their second card hidden.");
        System.out.println();
        boolean playerTurn = true;
        boolean dealerTurn = true;
        while (playerTurn = true){
            System.out.println("Your hand total is "+player.total+".");
            System.out.println("Hit or Stand?: ");
            String playerInput = input.nextLine();
            System.out.println();
            if (playerInput.equals("hit")){
                player.hit();
                System.out.println("You drew a "+player.hitCard+".");
            } else if (playerInput.equals("stand")){
                System.out.println("You stand, and the Dealer plays.");
                System.out.println();
                playerTurn = true;
            }
        }
        while (dealerTurn = true){
            System.out.println("Dealer reveals their card, "+dealer.card2+", the total is "+dealer.total+".");
            dealer.hit();
            System.out.println("Dealer drew a "+dealer.hitCard+", and the total is now "+dealer.total+".");
            if (dealer.total >= 17){
                dealerTurn = false;
            }
        }
    }
}
