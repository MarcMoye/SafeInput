import java.util.Scanner;

public class SafeInput {
    // Static methods definitions go here
    // Are called with SafeInput.methodName

    /**
     * A method that prompts for and returns a string response with at least one character
     *
     * @param pipe   the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return the non-empty string response from the user
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // initialize to empty string


        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if (retString.isEmpty()) {
                System.out.println("You must enter at least one character.");
            }

        } while (retString.isEmpty());

        return retString;
    }

    /**
     * a method that prompts for and returns an integer value
     *
     * @param pipe   the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @return any integer value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer. You entered: " + trash);
            }
        } while (!done);

        return retInt;
    }

    /**
     * a method that prompts for and returns a double value
     *
     * @param pipe   the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @return any dobule value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * a method that prompts for and returns an integer value within a specified range
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @param low the minimum acceptable integer (inclusive)
     * @param high the maximum acceptable integer (inclusive)
     * @return an integer value between low and high, inclusive
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine(); // clear the buffer
                if (retInt < low || retInt > high)
                {
                    System.out.println("You must enter an integer between " + low + " and " + high + ". You entered: " + retInt);
                }
                else
                    done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retInt;
    }

    /**
     * a method that prompts for and returns an double value within a specified range
     * @param pipe the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @param low the minimum acceptable double (inclusive)
     * @param high the maximum acceptable double (inclusive)
     * @return a double value between low and high, inclusive
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the buffer
                if (retVal < low || retVal > high)
                {
                    System.out.println("You must enter an integer between " + low + " and " + high + ". You entered: " + retVal);
                }
                else
                    done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * a method that prompts for and returns a yes/no response and returns equivalent boolean or true/false
     * @param pipe the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @return true if the user enters Y or y, false if the user enters N or n
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {

        String response = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase(); // trim removes leading/trailing spaces and toUpperCase makes it uppercase

            if (response.equals("Y")) {
                retVal = true;
                done = true;
            } else if (response.equals("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter Y or N. You entered: " + response);
            }
        } while (!done);

        return retVal;
    }

    /**
     * a method that prompts for and returns a string that matches the given regular expression
     * @param pipe the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @param regEx the regular expression pattern the input must match
     * @return a string that matches the given regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = ""; // initialize to empty string


        do {
            System.out.print("\n" + prompt + "[: " +regEx + "] ");
            retString = pipe.nextLine();

            if (!retString.matches(regEx))
            {
                System.out.println("You must enter a string that matches the pattern: " + regEx);
            }

        } while (!retString.matches(regEx));

        return retString;
    }

}
