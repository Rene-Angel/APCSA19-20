/**
 * Write a description of class ExceptionalNotes here.
 *
 * @author Rene-Angel Jaime
 * @version (11.13.19)
 */
public class ExceptionalNotes
{
    public static boolean test(int y) throws Exception
    {
        if(y<0)
        {
            throw new Exception("Y is negative");
        }
        return true;
    }
}