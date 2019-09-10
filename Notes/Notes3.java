
/**
 * @author Rene-Angel Jaime
 * @version 8.29.19
 */
public class Notes3
{
    public static final double PI = 3.1415936535897932384;
    int guacamole = 17;
    
    public static void main(){
            
    }
    /*List of operators:
     * * (multiplication)
     * -- (increment)
     * ++ (decrement)
     * + (addition)
     * - (subtraction)
     * % (modulus)
     * || (OR)
     * = (assignment)
     * < (greater than)
     * > (less than)
     * <= (greater than or equal to)
     * >= (less than or equal to)
     * && (AND)
     * / (division)
     * ! (NOT)
     * +=
     * -=
     * /=
     * %=
     * *=
     * == (primitive equality)
     * != (primitive inequality)
     */
    public static void equality(){
        int a = 5;
        int b = 5;
        System.out.println(a==b);// its a question double = is a question whilst 
        // singular = is a statement (is a equal to b?) Terminal outcome is "true"
        System.out.println();
        System.out.println("This is true");
        System.out.println(a==b);
        System.out.println();
        
        String c = "this";
        String d = "this";
        System.out.println(c == d); // DO NOT DO THIS!!!!!!!!!!!
        System.out.println(c.equals(d)); // USE THIS INSTEAD!
    }
    
    public static void mystery(){
        int a = 5;
        int b = 0;
        // System.out.println(a/b); Divide by zero and get an artithmetic exception
    }
    public static int round(double number){
        return (int) (number + 0.5); 
    }
}
