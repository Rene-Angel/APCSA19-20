
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
        System.out.println("Welcome to BlackJack!"); //Starting Introduction
        System.out.println("The Dealer draws 2 cards the shows their first card, "+dealer.getCard1()+", and keeps their second card hidden."); //Stating dealer;s
        System.out.println("You draw two cards, "+player.getCard1+"and"+player+"Your hand total is "+player.getTotal()+".");
        System.out.println();
        boolean playerTurn = true;
        boolean dealerTurn = true;
        while (playerTurn = true){
            System.out.println("Hit or Stand?: ");
            String playerInput = input.nextLine();
            System.out.println();
            if (playerInput.equals("hit")){
                player.hit();
                System.out.println("You drew a "+player.getHitCard()+".");
                System.out.println("Your hand total is "+player.getTotal()+".");
            } else if (playerInput.equals("stand")){
                System.out.println("You stand, and the Dealer plays.");
                System.out.println();
                playerTurn = false;
            }
        }
        System.out.println("Dealer reveals their card, "+dealer.getCard2()+", the total is "+dealer.getTotal()+".");
        while (dealerTurn = true){
            dealer.hit();
            System.out.println("Dealer drew a "+dealer.getHitCard()+", and the total is now "+dealer.getTotal()+".");
            if (dealer.getTotal() >= 17){
                dealerTurn = false;
            }
        }
        
    }
}
