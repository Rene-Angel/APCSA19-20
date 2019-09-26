
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
        boolean playerTurn = true;
        boolean dealerTurn = true;
        System.out.println("Welcome to Blackjack!"); //Starting Introduction
        System.out.println("The Dealer draws 2 cards the shows their first card, "+dealer.getCard1()+", and keeps their second card hidden."); //Stating dealer's first card while keeping their second card hidden until the player's turn is over.
        System.out.println("You draw two cards, "+player.getCard1()+" and "+player.getCard2()+". Your hand total is "+player.getTotal()+"."); //Stating the player's hand 
        System.out.println();
        
        while (playerTurn == true){
            System.out.println("Hit or Stand?: ");
            String playerInput = input.nextLine();
            System.out.println();
            if (playerInput.equals("hit")){
                player.hit();
                System.out.println("You drew a "+player.getHitCard()+".");
                System.out.println("Your hand total is "+player.getTotal()+".");
                player.bust();
                if (player.bust() == true){
                    System.out.println("You busted, the dealer plays.");
                    System.out.println();
                    playerTurn = false;
                }
            } else if (playerInput.equals("stand")){
                System.out.println("You stand, and the Dealer plays.");
                System.out.println();
                playerTurn = false;
            }
        }
        System.out.println("Dealer reveals their card, "+dealer.getCard2()+", the total is "+dealer.getTotal()+".");
        while (dealerTurn == true){
            dealer.hit();
            System.out.println("Dealer drew a "+dealer.getHitCard()+", and their total is now "+dealer.getTotal()+".");
            dealer.bust();
            if (dealer.getTotal() >= 17){
                if (dealer.bust() == true){
                    System.out.println("The dealer busts, their turn is over.");
                    dealerTurn = false;
                }
                System.out.println("The dealer stops stands, their turn is over.");
                dealerTurn = false;
            }
        }
        System.out.println();
        if (player.bust() == true && dealer.bust() == true){
            System.out.println("Nobody Wins!");
        } else if (player.bust() == true && dealer.bust() == false){
            System.out.println("Sad loss, the dealer wins. Thank you for playing Blackjack!");
        } else if (player.bust() == false && dealer.bust() == true){
            System.out.println("Congragulations, you won! Thank you for playing Blackjack!");
        } else if (player.bust() == false && dealer.bust() == false){
            if (player.getTotal() > dealer.getTotal()){
                System.out.println("Congragulations, you won! Thank you for playing Blackjack!");
            } else if (player.getTotal() < dealer.getTotal()){
                System.out.println("Sad loss, the dealer wins. Thank you for playing Blackjack!");
            } else if (player.getTotal() == dealer.getTotal()){
                System.out.println("Tie! Thank you for playing Blackjack!");
            }
        }
    }
}
