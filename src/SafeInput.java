import java.util.Scanner;

public class SafeInput
{
    // Static methods definitions go here
    // Are called with SafeInput.methodName
    /**
     * A method that prompts for and returns a string response with at least one character
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return the non-empty string response from the user
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // initialize to empty string


        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if (retString.isEmpty())
            {
                System.out.println("You must enter at least one character.");
            }

        } while (retString.isEmpty());

        return retString;
    }
}
