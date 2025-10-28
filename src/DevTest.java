import java.util.Scanner;

/**
 * A class to test the SafeInput library methods
 */
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temperature = 0.0;
        boolean confirm = false;

        // test for getNonZeroLenString
        // String name = getNonZeroLenString(in, "Enter your name");
        // System.out.println("Hello " + name);

        // 2nd test for the SafeInput library file:
        // name = SafeInput.getNonZeroLenString(in, "Enter your name");
        // System.out.println("Hello " + name);

        // test for getInt
       // int age = getInt(in, "Enter your age");
       // System.out.println("You are " + age + " years old.");

        // 2nd test for the SafeInput library file:
        // age = SafeInput.getInt(in, "Enter your age");
       // System.out.println("You are " + age + " years old.");

        // test for getDouble
       // double weight = getDouble(in, "Enter your weight");
       // System.out.println("You weigh " + weight + " pounds.");

        // 2nd test for the SafeInput library file:
       // weight = SafeInput.getDouble(in, "Enter your weight");
       // System.out.println("You weigh " + weight + " pounds.");


        // test for getRangedInt
      //  int grade = getRangedInt(in, "Enter your grade", 0, 100);
      //  System.out.println("You have a grade of " + grade + "%.");

        // 2nd test for the SafeInput library file:
        // grade = SafeInput.getRangedInt(in, "Enter your grade", 0, 100);
        // System.out.println("You have a grade of " + grade + "%.");

        // test for getRangedDouble
        //double temp = getRangedDouble(in, "Enter the temperature", -20.0, 120.0);
       // System.out.println("The temperature is " + temp + " degrees.");

        // 2nd test for the SafeInput library file:
        //temp = SafeInput.getRangedDouble(in, "Enter the temperature", -20.0, 120.0);
        //System.out.println("The temperature is " + temp + " degrees.");


        // test for getYNConfirm
         // boolean cont = getYNConfirm(in, "Do you want to continue");
         // System.out.println("You entered: " + cont);

        // 2nd test for the SafeInput library file:
          //cont = SafeInput.getYNConfirm(in, "Do you want to continue");
          //System.out.println("You entered: " + cont);

        // test for getRegExString
          String id = getRegExString(in, "Enter your UC Student id (M-Number)", "^(M|m)\\d{8}$");
           System.out.println("You entered: " + id);

        // 2nd test for the SafeInput library file:
          id = SafeInput.getRegExString(in, "Enter your UC Student id (M-Number)", "^(M|m)\\d{8}$");
          System.out.println("You entered: " + id);
    }


    // Code for the library methods goes here to be tested
    // then is copied or moved to SadeInput

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
                System.out.println("You must enter an integer. not: " + trash);
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
     * @param pipe   the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @param low    the minimum acceptable integer (inclusive)
     * @param high   the maximum acceptable integer (inclusive)
     * @return an integer value between low and high, inclusive
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine(); // clear the buffer
                if (retInt < low || retInt > high) {
                    System.out.println("You must enter an integer between " + low + " and " + high + ". You entered: " + retInt);
                } else
                    done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retInt;
    }

    /**
     * a method that prompts for and returns an double value within a specified range
     *
     * @param pipe   the scanner to use for input
     * @param prompt the prompt to display to the user to indicate what to input
     * @param low    the minimum acceptable double (inclusive)
     * @param high   the maximum acceptable double (inclusive)
     * @return a double value between low and high, inclusive
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the buffer

                if (retVal < low || retVal > high) {
                    System.out.println("You must enter an number between " + low + " and " + high + ". You entered: " + retVal);
                } else {
                    done = true;
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not: " + trash);
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
        public static String getRegExString (Scanner pipe, String prompt, String regEx)
        {
            String retString = ""; // initialize to empty string


            do {
                System.out.print("\n" + prompt + "[: " + regEx + "] ");
                retString = pipe.nextLine();

                if (!retString.matches(regEx)) {
                    System.out.println("You must enter a string that matches the pattern: " + regEx);
                }

            } while (!retString.matches(regEx));

            return retString;
        }


    }
