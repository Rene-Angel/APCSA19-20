/**
 * These are the notes on Array Lists.
 *
 * @author Rene-Angel Jaime
 * @version (2.24.20)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Notes
{
    private ArrayList shoppingCart;
    public Notes(){
        shoppingCart = new ArrayList();
        shoppingCart.add("milk");
        shoppingCart.add(new Integer(5));
        shoppingCart.add(new Scanner(System.in));
        
        System.out.println(shoppingCart.get(0)); // looks into the index
    }
    public static void main(){
        ArrayList<String> words = new ArrayList<String>(); // angel brackets < >
        words.add("Dog");
        words.add("Cat");
        words.add(0, "Cringe");
        words.add("Glue");
        words.add(words.size(), "Does this work?");
        for(String word : words){
            System.out.println(word);
        }
        for(int i=0; i<words.size(); i++){
            System.out.println(words.get(i));
        }
        // Taking stuff out
        words.remove(4);
        // Removing something specific
        // THIS IS BROKEN!!!*****
        for(int i=0; i<words.size(); i++){
            if(words.get(i).equals("Dog")){
                words.remove(i);
            }
        }
        
    }
}
