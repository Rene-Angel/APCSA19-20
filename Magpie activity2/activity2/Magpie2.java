/**
 * @author Rene-Angel Jaime
 * @version (10.1.19)
 */
public class Magpie2
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    public String getResponse(String statement)
    {
        String response = "";
        statement = statement.trim();
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf(" ") >= 0)
        {
            response = "Say something, please.";
        }
        else if (statement.indexOf("Mr.Wiebe") >= 0
                || statement.indexOf("mr.wiebe") >= 0
                || statement.indexOf("Wiebe") >= 0
                || statement.indexOf("wiebe") >= 0)
        {
            response = "He sounds like a very cool teacher.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("hmm") >= 0)
        {
            response = "Yes?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Repeat that please?";
        }
        else if (whichResponse == 5)
        {
            response = "I don't know how to respond to that.";
        }
        return response;
    }
}
