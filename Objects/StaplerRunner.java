
/**
 * Write a description of class Staple here.
 *
 * @author Rene-Angel Jaime
 * @version (9.5.19)
 */
public class StaplerRunner
{
    public static void main(){
        Stapler myStapler = new Stapler();
        Stapler stapler2 = new Stapler("PaperPro");
        // This doesn't work, since a
        // constructor doesn't exist
        // "Stapler stapler3 = new Stapler(100);"
        
        
        // System.out.println(myStapler.jammed); This can only bne possible if boolean isJammed is made public
        myStapler.stapleStuff();
        myStapler.stapleStuff();
        stapler2.stapleStuff();
    }
}
