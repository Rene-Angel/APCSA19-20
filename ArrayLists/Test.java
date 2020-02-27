/**
 * @author Rene-Angel Jaime
 * @version (2.27.20)
 */
import java.util.List;
import java.util.Arraylist;

public class Test
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<String>();
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
        for (int i = 0; i <= friends.length; i++)
        {
            names.add(friends[i]);
        }
        System.out.println(names);
    }
}