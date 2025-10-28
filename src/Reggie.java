import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(input, "Enter your SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(input, "Enter your UC Student M number", "^(M|m)\\d{8}$");
        System.out.println("You entered a valid M number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(input, "Enter your menu choice (O/S/V/Q)", "^[OoSsVvQq]$");
        System.out.println("You entered a valid menu choice: " + menuChoice);


    }
}
