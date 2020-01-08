

/**
 * A program to carry on conversations with a human user.
 * This version uses a nested if to handle default responses.
 * @author Arin Gadre
 * @version 930
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if(statement.trim().length() == 0){
            response = "Say something, please.";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if(statement.indexOf("why") >= 0){
            response = "Because I said so.";
        }
        else if(statement.indexOf("when") >= 0){
            response = "I don't know, check your calendar.";
        }
        else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat") >= 0
        || statement.indexOf("dog") >= 0
        || statement.indexOf("fish") >= 0
        || statement.indexOf("bunny") >= 0
        || statement.indexOf("snake") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if(statement.indexOf("Ettlin") >= 0
        || statement.indexOf("ettlin") >= 0){
            response = "He sounds like a great teacher.";
        }
        else if(statement.indexOf("name") >= 0){
            response = "My name is Kanye. What is your name?";
        }
        else if(statement.indexOf("favorite color") >= 0){
            response = "My favorite color is red. What is your favorite color?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
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
            response = "Are you sure?";
        }
        else if (whichResponse == 5)
        {
            response = "Wow, I had no idea.";
        }
        return response;
    }
}
