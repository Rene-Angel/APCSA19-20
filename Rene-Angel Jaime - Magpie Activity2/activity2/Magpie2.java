/**
 * @author Rene-Angel Jaime
 * @version (10.1.19)
 */
public class Magpie2
{
    /*
     * Question: What happens when a keyword is included in another word?
     *           Consider statements like "I know all the state capitals" and "I like
     *           vegetables smothered in cheese." Explain the problem with the responses
     *           to these statements.
     *           
     * Response: When a keyword is included in another word, the response will be to the
     *           keyword as it is detected within the statement, instead of the entire
     *           statement in general. What is wrong with these specific statements are 
     *           the keywords "no" and "mother" that the program detects in the words "know" 
     *           and "smothered", thus responding with "Why so negative?" and "Tell me more 
     *           about your family."
     * 
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.trim().indexOf("mother") >= 0
                || statement.trim().indexOf("father") >= 0
                || statement.trim().indexOf("sister") >= 0
                || statement.trim().indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.trim().indexOf("Mr.Wiebe") >= 0
                || statement.trim().indexOf("mr.wiebe") >= 0
                || statement.trim().indexOf("Wiebe") >= 0
                || statement.trim().indexOf("wiebe") >= 0)
        {
            response = "He sounds like a very cool teacher.";
        }
        else if (statement.trim().indexOf("dog") >= 0
                || statement.trim().indexOf("cat") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.trim().indexOf("hmm") >= 0) //Keyword 1
        {
            response = "Yes?";
        }
        else if (statement.trim().indexOf("hello") >= 0) // Keyword 2
        {
            response = "Have we met?";
        }
        else if (statement.trim().indexOf("yes") >= 0) //Keyword 3
        {
            response = "Yes, what?";
        }
        else if (statement.trim().indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf(" ") >= 0)
        {
            response = "Say something, please.";
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
