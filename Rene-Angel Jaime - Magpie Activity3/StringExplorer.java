/**
 * @author Rene-Angel Jaime
 * @version (10.3.19)
 */

public class StringExplorer
{
    public static void main(String[] args)
	{
	    String sample = "The quick brown fox jumped over the lazy dog.";
	    
	    //  Demonstrates the indexOf method.
	    int position = sample.indexOf("quick");
	    System.out.println ("sample.indexOf(\"quick\") = " + position);
	    
	    //  Demonstrates the toLowerCase method.
	    String lowerCase = sample.toLowerCase();
	    System.out.println ("sample.toLowerCase() = " + lowerCase);
	    System.out.println ("After toLowerCase(), sample = " + sample);
	    
	    //  Demonstrates the toUpperCase method.
	    String upperCase = sample.toUpperCase();
	    System.out.println ("sample.toUpperCase() = " + upperCase);
	    System.out.println ("After toUpperCase(), sample = " + sample);
	}
}
